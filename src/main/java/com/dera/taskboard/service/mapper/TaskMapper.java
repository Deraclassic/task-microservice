package com.dera.taskboard.service.mapper;

import com.dera.taskboard.domain.Task;
import com.dera.taskboard.service.dto.TaskDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {}
