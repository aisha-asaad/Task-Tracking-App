package com.devtiro.tasks.domain.dto;

import com.devtiro.tasks.domain.entities.TaskPriority;
import com.devtiro.tasks.domain.entities.TaskStatus;

import java.time.LocalDate;

public class TaskDto2

 {
     String title;
     String description;
     LocalDate dueDate;
     TaskPriority priority;
     TaskStatus status;

     public TaskDto2(String title, String description, LocalDate dueDate, TaskPriority priority, TaskStatus status) {
         this.title = title;
         this.description = description;
         this.dueDate = dueDate;
         this.priority = priority;
         this.status = status;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     public LocalDate getDueDate() {
         return dueDate;
     }

     public void setDueDate(LocalDate dueDate) {
         this.dueDate = dueDate;
     }

     public TaskPriority getPriority() {
         return priority;
     }

     public void setPriority(TaskPriority priority) {
         this.priority = priority;
     }

     public TaskStatus getStatus() {
         return status;
     }

     public void setStatus(TaskStatus status) {
         this.status = status;
     }

     @Override
     public String toString() {
         return "TaskDto{" +
                 "title='" + title + '\'' +
                 ", description='" + description + '\'' +
                 ", dueDate=" + dueDate +
                 ", priority=" + priority +
                 ", status=" + status +
                 '}';
     }
 }
