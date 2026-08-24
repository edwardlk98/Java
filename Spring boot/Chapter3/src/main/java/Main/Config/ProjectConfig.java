package Main.Config;
import Main.Beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "Main")
public class ProjectConfig {
    @Bean
    public User user2(Form f){
        User u = new User(f);
        f.setFormID("EmptyForm123");
        u.setUsername("Lahai");
        return u;
    }
}
