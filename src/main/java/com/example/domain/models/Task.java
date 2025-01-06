package com.example.domain.models;

public class Task {
  private long id;
  private Spring title;
  private String description;
  private LocalDateTime creationDate;
  private boolean completed;


  // creamos el controlador
  
  public Task(long id, String title, String description,LocalDateTime creationDate, boolean completed){
    this.id =  id;
    this.title = title;
    this.description = description;
    this.creationDate = creationDate;
    this.completed = completed;
    
    
  }
  public long getId() {
    return id;
  }
  public String getTitle() {
    return title;
  }
  public String getDescription() {
    return description;
  }
  public LocalDateTime getCreationDate() {
    return creationDate;
  }
  public boolean isCompleted() {
    return completed;
  }
  public void setId(long id) {
    this.id = id;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }
  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
  
}
