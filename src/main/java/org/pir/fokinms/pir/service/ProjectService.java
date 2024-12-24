package org.pir.fokinms.pir.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.pir.fokinms.pir.dto.ProjectDto;
import org.pir.fokinms.pir.entity.project.Project;
import org.pir.fokinms.pir.mapper.ProjectMapper;
import org.pir.fokinms.pir.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Transactional
    public ProjectDto create(ProjectDto projectDto) {
        Project project = projectRepository.save(projectMapper.toEntity(projectDto));
        return projectMapper.toDto(project);
    }

    @Transactional
    public ProjectDto update(ProjectDto projectDto) {
        if (isExist(projectDto.getId())) {
            Project project = projectRepository.save(projectMapper.toEntity(projectDto));
            return projectMapper.toDto(project);
        } else {
            throw new EntityNotFoundException("Project with id " + projectDto.getId() + " not found");
        }
    }

    @Transactional
    public void delete(long projectId) {
        projectRepository.deleteById(projectId);
    }

    @Transactional(readOnly = true)
    public ProjectDto get(long projectId) {
        return projectMapper.toDto(projectRepository.findById(projectId)
                .orElseThrow(() -> new EntityNotFoundException("Project with id " + projectId + " not found")));
    }

    private boolean isExist(long projectId) {
        return projectRepository.existsById(projectId);
    }
}
