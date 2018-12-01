package com.kurnakov.project_manager.backend.core.repository;

import com.kurnakov.project_manager.backend.core.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {

}
