package az.codenext.blog.services;

import az.codenext.blog.dtos.article.ArticleDateilDto;
import az.codenext.blog.models.Articel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticelServices {
    List<Articel> homeArticel();
    ArticleDateilDto getArticleDateil(Long id);

    default ArticleDateilDto getArticleDateil() {
        return null;
    }
}
