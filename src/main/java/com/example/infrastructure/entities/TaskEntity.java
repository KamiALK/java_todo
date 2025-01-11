package com.example.infrastructure.entities;


@Entity 
public class TaskEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)// auto increment numbre id
  private Long id;
  private String title;
  private String description;
  private LocalDateTime creationDate;
  private boolean completed;
 // this is the constructor empty
  public TaskEntity()
  {}
  // this is the constructor
   public TaskEntity(Long id, String title, String description,LocalDateTime creationDate, boolean completed){
    this.id =  id;
    this.title = title;
    this.description = description;
    this.creationDate = creationDate;
    this.completed = completed;
  }
  //this is the metod static so , lets pass  los valores class del dominio 
public static TaskEntity fromDomainModel(Task task) {
  return new TaskEntity(
      task.getId(),
      task.getTitle(),
      task.getDescription(),
      task.getCreationDate(),
      task.isCompleted()
  );


}
  public Task toDomainMododel() {
       return new Task(id,title,description,creationDate,completed);
  }
  public Long getId() {
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
  public void setId(Long id) {
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
