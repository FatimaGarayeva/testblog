package az.codenext.blog.controller;
import az.codenext.blog.models.Articel;
import az.codenext.blog.services.ArticelServices;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    private final ArticelServices articelServices;
    public HomeController(ArticelServices articelServices){
        this.articelServices=articelServices;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Articel>  articles = articelServices.homeArticel();
        model.addAttribute("articles",articles);
         return "/home";
    }
}



