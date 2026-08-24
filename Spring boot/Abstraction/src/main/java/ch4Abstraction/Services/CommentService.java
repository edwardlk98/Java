package ch4Abstraction.Services;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ch4Abstraction.*;
import ch4Abstraction.Proxies.CommentNotificationProxy;
import ch4Abstraction.repositories.CommentRepository;
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
        CommentRepository commentRepository,
        @Qualifier("EMAIL")CommentNotificationProxy commentNotificationProxy
    ){
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComent(comment);
    }
}
