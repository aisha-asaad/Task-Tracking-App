package com.devtiro.tasks.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {

@Id
@GeneratedValue(strategy = GenerationType.UUID)
@Column(name = "id", updatable = false, nullable = false)
private UUID id;

@Column(name = "title", nullable = false)
private String title;

@Column(name = "description")
private String description;

@Column(name = "due_date")
private LocalDate dueDate;

@Column(name = "priority", nullable = false)
private TaskPriority priority;

@Column(name = "status", nullable = false)
private TaskStatus status;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "task_list_id")
private TaskList taskList;


@Column(name = "created", nullable = false)
private LocalDateTime created;

@Column(name = "updated", nullable = false)
private LocalDateTime updated;



    public Task(UUID id, String title, String description, TaskList taskList, LocalDate dueDate, TaskPriority priority, TaskStatus status, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.taskList = taskList;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public Task() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(taskList, task.taskList) && Objects.equals(dueDate, task.dueDate) && priority == task.priority && status == task.status && Objects.equals(created, task.created) && Objects.equals(updated, task.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, taskList, dueDate, priority, status, created, updated);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", taskList=" + taskList +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}