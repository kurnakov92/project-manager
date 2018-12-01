package com.kurnakov.project_manager.backend.core.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "project")
public class Project {

    @Id
    private String id;
    private long startDate;
    private long deadline;
    private DevelopmentPlan developmentPlan;

}
