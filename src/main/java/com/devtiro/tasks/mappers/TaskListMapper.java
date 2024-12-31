package com.devtiro.tasks.mappers;

import com.devtiro.tasks.domain.dto.TaskListDto;
import com.devtiro.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto dto);
    TaskListDto toDto(TaskList taskList);

}
