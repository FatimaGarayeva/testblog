package az.codenext.blog.repositories;

import az.codenext.blog.models.Articel;
import az.codenext.blog.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Set;

public interface ArticelRepository extends JpaRepository<Articel,Long> {

}
