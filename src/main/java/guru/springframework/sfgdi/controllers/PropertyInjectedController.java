package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
