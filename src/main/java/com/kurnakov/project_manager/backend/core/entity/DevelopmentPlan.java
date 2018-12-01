package com.kurnakov.project_manager.backend.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Getter
public class DevelopmentPlan {

    private List<String> sprintList;
    private List<String> todoList;

    public void addSprint(String sprint) {
        this.sprintList.add(sprint);
        log.info("Sprint added: {}", sprint);
    }

    public void addTodo(String todo) {
        this.todoList.add(todo);
        log.info("Todo added: {}", todo);
    }

    public void updateSprintList(List<String> sprintList) {
        this.sprintList = sprintList;
        log.info("Sprint list updated: {}", sprintList.toString());
    }

    public void updateTodoList(List<String> todoList) {
        this.todoList = todoList;
        log.info("Todo list updated: {}", todoList.toString());
    }

}
