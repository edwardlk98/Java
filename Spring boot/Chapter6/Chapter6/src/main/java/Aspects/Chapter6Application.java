package Aspects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class Chapter6Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(projectConfig.class);
		var service = context.getBean(CommentService.class);

		comment Comment = new comment();
		Comment.setText("Demo Coment");
		Comment.setAuthor("Natasha");

		service.publishComment(Comment);
	}

}
