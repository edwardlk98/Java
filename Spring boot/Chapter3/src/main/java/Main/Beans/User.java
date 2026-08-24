package Main.Beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class User {
    private String username;
    private final Form form;

    @Autowired
    public User(Form form){
        this.form = form;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public Form getForm() {
        return form;
    }

    @Override
    public String toString(){
        return "Name "+username + " formID: " + form;
    }
}
