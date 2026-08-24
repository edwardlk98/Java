package Registration.Services;
import org.springframework.stereotype.Component;

import Registration.*;
import Registration.Repository.credentialRepository;
@Component
public class formService {

    private final credentialRepository credentialRepository;

    public formService(credentialRepository credentialRepository){
        this.credentialRepository = credentialRepository;
    }

    public void processForm(form form){
        credentialRepository.storeCredentials(form);
    }

}
