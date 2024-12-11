package az.codenext.blog.services.impls;

import az.codenext.blog.dtos.article.ArticleDateilDto;
import az.codenext.blog.dtos.category.CategoryDto;
import az.codenext.blog.models.Articel;
import az.codenext.blog.repositories.ArticelRepository;
import az.codenext.blog.services.ArticelServices;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ArticelServicesImpl implements ArticelServices {

    private final ArticelRepository articelRepository;

    public ArticelServicesImpl(ArticelRepository articelRepository){
        this.articelRepository = articelRepository;

    }



    @Override
    public List<Articel> homeArticel() {
        List<Articel> articels = articelRepository.findAll();
        return  articels;
    }
   @Override
    public ArticleDateilDto getArticleDateil(Long id) {
       Articel articel = articelRepository.findById(id).orElseThrow();
      ArticleDateilDto result = new ArticleDateilDto();


       return result;



    }

}
