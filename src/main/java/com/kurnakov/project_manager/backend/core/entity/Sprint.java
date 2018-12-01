package com.kurnakov.project_manager.backend.core.entity;

import lombok.Data;

@Data
public class Sprint {
    private long created;
    private long dueDate;
    private String body;
}
