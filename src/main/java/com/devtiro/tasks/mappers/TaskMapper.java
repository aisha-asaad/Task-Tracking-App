package com.devtiro.tasks.mappers;

import com.devtiro.tasks.domain.dto.TaskDto;

import com.devtiro.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto dto);
    TaskDto toDto(Task task);

}