
package com.example.infrastructure.adapters;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

public class ExternalServiceAdapter implements ExternalServicePort {

    private final RestTemplate restTemplate;

    public ExternalServiceAdapter(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public AditionalTaskInfo getAditionalTaskInfo(Long taskId) {
        String url = "https://jsonplaceholder.typicode.com/todos/" + taskId;
        ResponseEntity<JsonPlaceholderAPI> response = restTemplate.getForEntity(url, JsonPlaceholderAPI.class);
        JsonPlaceholderAPI jsonPlaceholderAPI = response.getBody();

        User user = null; // Inicialización
        if (jsonPlaceholderAPI != null) {
            String urlUser = "https://jsonplaceholder.typicode.com/users/" + jsonPlaceholderAPI.getUserId();
            ResponseEntity<User> responseUser = restTemplate.getForEntity(urlUser, User.class);
            user = responseUser.getBody();
            if (user != null) {
                return new AditionalTaskInfo(user.getId(), user.getName(), user.getEmail());
            }
        }
        return null; // Manejo de errores o caso sin datos
    }

    private class JsonPlaceholderAPI {
        private Long id;
        private Long userId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }
    }

    private class User {
        private Long id;
        private String name;
        private String email;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
