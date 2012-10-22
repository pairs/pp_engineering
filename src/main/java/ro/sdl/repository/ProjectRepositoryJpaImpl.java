package ro.sdl.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;

@Repository
public class ProjectRepositoryJpaImpl extends AbstractRepository implements ProjectRepository {

	public Project load(Integer projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Project> getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public Project add(Project project) {
		System.out.println("creating project in repo");
		em.persist(project);
		return project;
	}

	public void update(Project project) {
		// TODO Auto-generated method stub

	}

	public void delete(Integer projectId) {
		// TODO Auto-generated method stub

	}

	public List<User> getProjectUsers(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

}
