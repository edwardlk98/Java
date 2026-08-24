package Aspects;

import java.util.logging.Logger;

import javax.xml.stream.events.Comment;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public void publishComment(comment Comment){
        logger.info("Publishiing comment: " + Comment.getText());
    }
}
