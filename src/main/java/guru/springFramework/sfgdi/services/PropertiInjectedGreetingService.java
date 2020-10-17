package guru.springFramework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertiInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
