package az.codenext.blog.dtos.article;

import az.codenext.blog.dtos.category.CategoryDto;
import az.codenext.blog.models.Category;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
@Data
public class ArticleDateilDto {
    private String detail;
    private String title;
    @Column(length = 1000)
    private String description;
    private int view;
    private Date createDate;
    private  String photoUrl;
    private CategoryDto category;
}
