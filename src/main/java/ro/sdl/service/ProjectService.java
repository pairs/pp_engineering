package ro.sdl.service;

import java.util.List;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;
import ro.sdl.dto.ProjectDetailedDistributionDTO;
import ro.sdl.dto.ProjectDistributionDTO;

public interface ProjectService {

    public Boolean removeUserFromProject(Project project, User user);

    public ProjectDistributionDTO getProjectDistribution(Project project);

    public ProjectDetailedDistributionDTO getProjectDetailedDistribution(Project project);

    public ProjectDetailedDistributionDTO getProjectDetailedDistribution();

    public List<Project> listProjectWithRole(int value);

    public List<Project> listProjectWithState(int value);

    public List<User> getProjectComposition(Project project);
    
    public Project create(Project project);
}
