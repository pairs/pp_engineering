package ro.sdl.repository;

import java.util.Collection;

import ro.sdl.domain.User;

public interface UserRepository {

    User load(long userId);

	Collection<User> getUsers();

	User add(User user);

	void update(User user);

	void delete(long userId);
}
