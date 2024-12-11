package az.codenext.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Gadgets {
    @GetMapping("/gadgets")
    public String gagets(){
        return "/gadgets";
    }
}
