package ro.sdl.repository;

import ro.sdl.application.data.AppDataLoader;
import ro.sdl.domain.*;
import java.util.Collection;
import java.util.List;

public class ProjectRepositoryMemoryImpl implements ProjectRepository {


    public Project load(Integer projectId) {
        for (Project currentProject : AppDataLoader.projects) {
            if (currentProject.getId() == projectId) {
                return currentProject;
            }
        }
        return null;
    }

    public Collection<Project> getProjects() {
        return AppDataLoader.projects;
    }

    public Project add(Project project) {
        AppDataLoader.projects.add(project);
        return project;
    }

    public void update(Project project) {
        for (Project currentProject : AppDataLoader.projects) {
            if (currentProject.getId() == project.getId()) {
                currentProject.setUsers(project.getUsers());
                currentProject.setDescription(project.getDescription());
            }
        }
    }

    public void delete(Integer projectId) {
        for (Project currentProject : AppDataLoader.projects) {
            if (currentProject.getId() == projectId) {
                AppDataLoader.projects.remove(currentProject);

            }
        }
    }

    public List<User> getProjectUsers(Project project) {
        return project.getUsers();
    }
}
