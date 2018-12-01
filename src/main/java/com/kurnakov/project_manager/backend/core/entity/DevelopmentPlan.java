package com.kurnakov.project_manager.backend.core.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
public class DevelopmentPlan {

    private List<Sprint> sprintList;
    private List<Todo> todoList;

}
