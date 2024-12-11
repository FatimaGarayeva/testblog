package az.codenext.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contact {
    @GetMapping("/contact")
    public String contact (){
        return "/contact";
    }
}
