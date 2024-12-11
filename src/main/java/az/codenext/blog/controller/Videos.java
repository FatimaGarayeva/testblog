package az.codenext.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Videos {
    @GetMapping ("/videos")
        public String videos(){
        return"/videos";
        }
}
