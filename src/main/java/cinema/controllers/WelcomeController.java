package cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/")
public class WelcomeController {
    @GetMapping("/")
    public @ResponseBody String welcome(){
        return "Welcome";
    }
}
