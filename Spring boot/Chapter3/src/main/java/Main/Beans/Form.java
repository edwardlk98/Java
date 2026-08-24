package Main.Beans;
import org.springframework.stereotype.Component;
@Component
public class Form {
    private String formID;

    public String getFormID() {
        return formID;
    }
    public void setFormID(String formID) {
        this.formID = formID;
    }
    @Override
    public String toString(){
        return formID;
    }
}
