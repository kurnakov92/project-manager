package com.kurnakov.project_manager.backend.core.service.impl;

import com.kurnakov.project_manager.backend.core.entity.Project;
import com.kurnakov.project_manager.backend.core.repository.ProjectRepository;
import com.kurnakov.project_manager.backend.core.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createProject(Project project) {
        repository.save(project);
        log.info("Project created & saved to repo: {}", project.toString());
    }

    @Override
    public Project getProject(String id) {
        return repository.findById(id).isPresent() ? repository.findById(id).get() : new Project();
    }

    @Override
    public void updateProject(Project project) {
        repository.save(project);
        log.info("Project updated in repo: {}", project.toString());
    }

    @Override
    public void deleteProject(String id) {
        Project project;
        if (repository.findById(id).isPresent()){
            project = repository.findById(id).get();
            repository.deleteById(id);
            log.info("Project deleted from repo: {}", project.toString());
        } else {
            log.info("Not found project to delete with id: {}", id);
        }
    }
}
