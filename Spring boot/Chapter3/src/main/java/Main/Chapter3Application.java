package Main;
import Main.Beans.*;
import Main.Config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Chapter3Application {

	public static void main(String[] args) {
		//SpringApplication.run(Chapter3Application.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		User u2 = context.getBean("user2",User.class);
		User u = context.getBean("user",User.class);
		u2.setUsername("Edward Kiawoin");
		u.setUsername("Lahai");
		
		
		System.out.println("User: "+ u2.getUsername());
		System.out.println("Form User: " + u2.getForm());

		System.out.println("User: "+ u.getUsername());
		System.out.println("Form User: " + u.getForm());
	}

}
