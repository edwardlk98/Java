package ch4Abstraction.Proxies;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ch4Abstraction.*;
@Component
@Qualifier("EMAIL")
public class EmailNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComent(Comment comment){
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
