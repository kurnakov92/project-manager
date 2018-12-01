package com.kurnakov.project_manager.backend.core.service;

import com.kurnakov.project_manager.backend.core.entity.Project;

public interface ProjectService {

    void createProject(Project project);

    Project getProject(String id);

    void updateProject(Project project);

    void deleteProject(String id);

}
