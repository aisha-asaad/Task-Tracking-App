package com.devtiro.tasks.mappers.impl;

import com.devtiro.tasks.domain.dto.TaskDto;
import com.devtiro.tasks.domain.entities.Task;
import com.devtiro.tasks.mappers.TaskMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public Task fromDto(TaskDto dto) {
        return new Task(
                dto.id(),
                dto.title(),
                dto.description(),
                null,
                LocalDate.parse(dto.dueDate().toString()),
                dto.priority(),
                dto.status(),
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return  new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
