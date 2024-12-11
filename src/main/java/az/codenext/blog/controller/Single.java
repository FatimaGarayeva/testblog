package az.codenext.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Single {
    @GetMapping("/single/{id}")
    public String single(@PathVariable Long id)
    {
        return "/single";
    }
}
