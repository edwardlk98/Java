package Registration;
import Registration.*;
import Registration.Services.formService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(projectConfig.class);

		var form = new form();
		form.setUserName("Edward K");
		form.setPassword("1234");

		var FormService = context.getBean(formService.class);
		FormService.processForm(form);
	}

}
