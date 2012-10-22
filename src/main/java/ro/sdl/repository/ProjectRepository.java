package ro.sdl.repository;

import java.util.Collection;
import java.util.List;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;

public interface ProjectRepository {

	Project load(Integer projectId);

	Collection<Project> getProjects();

	Project add(Project project);

	void update(Project project);

	void delete(Integer projectId);

	public List<User> getProjectUsers(Project project);
}
