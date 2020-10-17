package guru.springFramework.sfgdi.controllers;

import guru.springFramework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    private final GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String seyHello() {
        return greetingService.sayGreeting();
    }
}
