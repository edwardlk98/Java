package ch4Abstraction.main;
import ch4Abstraction.*;
import ch4Abstraction.Proxies.EmailNotificationProxy;
import ch4Abstraction.Services.CommentService;
import ch4Abstraction.repositories.DBCommentRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AbstractionApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		var comment = new Comment();

		comment.setAuthor("Laurentiu");
		comment.setText("Demo Comment");
		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
