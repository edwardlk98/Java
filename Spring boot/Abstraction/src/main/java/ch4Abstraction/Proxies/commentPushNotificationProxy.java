package ch4Abstraction.Proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ch4Abstraction.Comment;
@Component
@Qualifier("PUSH")
public class commentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComent(Comment comment){
        System.out.println("Sendign Push Notification for comment: " + comment.getText());
    };
}
