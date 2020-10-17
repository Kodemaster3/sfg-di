package guru.springFramework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String seyHello() {
        System.out.println("Hello man!!");
        
        return "Hey dude";
    }
}
