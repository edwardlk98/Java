package ch4Abstraction.repositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ch4Abstraction.*;
@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment){
        System.out.println("Strong Comment: " +  comment.getText());
    }
}
