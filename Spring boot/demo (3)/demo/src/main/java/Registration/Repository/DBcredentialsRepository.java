package Registration.Repository;

import org.springframework.stereotype.Component;

import Registration.form;
@Component
public class DBcredentialsRepository implements credentialRepository{

    @Override
    public void storeCredentials(form form){
        System.out.println("Credentials for: " +  form.getUserName() +  "Stored succesfully");
    }
}
