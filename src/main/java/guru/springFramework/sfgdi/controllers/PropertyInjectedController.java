package guru.springFramework.sfgdi.controllers;

import guru.springFramework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;
    
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
