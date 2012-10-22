package ro.sdl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;
import ro.sdl.service.ProjectService;
import ro.sdl.service.UserService;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		
		ProjectService projectService = ctx.getBean(ProjectService.class);
		UserService userService = ctx.getBean(UserService.class);
		

		projectService.create(new Project());

		userService.create(new User());
	}

}
