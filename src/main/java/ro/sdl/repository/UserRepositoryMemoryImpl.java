package ro.sdl.repository;

import java.util.Collection;

import ro.sdl.application.data.AppDataLoader;
import ro.sdl.domain.User;

public class UserRepositoryMemoryImpl implements UserRepository {


    public User load(long userId) {
        for (User currentUser : AppDataLoader.users) {
            if (currentUser.getId() == userId) {
                return currentUser;
            }

        }
        return null;
    }

    public Collection<User> getUsers() {
        return AppDataLoader.users;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public User add(User user) {
        AppDataLoader.users.add(user);
		return user;
    }

    public void update(User user) {
        for (User currentUser : AppDataLoader.users) {
            if (currentUser.getId() == user.getId()) {
                currentUser.setName(user.getName());
                currentUser.setRole(user.getRole());
                currentUser.setState(user.getState());
                currentUser.setProject(user.getProject());

            }

        }
    }

    public void delete(long userId) {
        for (User currentUser : AppDataLoader.users) {
            if (currentUser.getId() == userId) {
                AppDataLoader.users.remove(currentUser);

            }

        }
    }
}
