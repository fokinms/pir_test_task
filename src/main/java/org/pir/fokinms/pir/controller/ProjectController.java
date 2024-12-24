package org.pir.fokinms.pir.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.pir.fokinms.pir.dto.ProjectDto;
import org.pir.fokinms.pir.service.ProjectService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("project")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping("/")
    public ProjectDto createProject(@RequestBody @Valid ProjectDto projectDto) {
        return projectService.create(projectDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable @Min(0) long id) {
        projectService.delete(id);
    }

    @PutMapping("/")
    public ProjectDto updateProject(@RequestBody @Valid ProjectDto projectDto) {
        return projectService.update(projectDto);
    }

    @GetMapping("/{id}")
    public ProjectDto getProject(@PathVariable @Min(0) long id) {
        return projectService.get(id);
    }
}
