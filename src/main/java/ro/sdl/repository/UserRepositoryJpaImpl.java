package ro.sdl.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import ro.sdl.domain.User;

@Repository
public class UserRepositoryJpaImpl extends AbstractRepository implements UserRepository {

	
	public User load(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User add(User user) {
		System.out.println("persisting user in repo");
		em.persist(user);
		return user;
	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}

	public void delete(long userId) {
		// TODO Auto-generated method stub

	}

}
