package ro.sdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sdl.domain.User;
import ro.sdl.repository.ProjectRepository;
import ro.sdl.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	UserRepository userRepository;


	public User create(User user) {
		System.out.println("creating user in service");
		return null;
	}
	
	
}
