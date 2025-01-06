package com.example.domain.models;

import java.time.LocalDateTime;


public class AditionalTaskInfo {
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
}
