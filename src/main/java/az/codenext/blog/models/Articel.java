package az.codenext.blog.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.swing.text.html.HTML;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="articels")
public class Articel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(length = 1000)
    private String description;
    private String seoUrl;
    private int view;
    private Date createDate;
    private Date updatedDate;
    private  String photoUrl;
    @ManyToOne
    private Category category;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name ="articel_tags",
            joinColumns = @JoinColumn(name = "articels",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tags",referencedColumnName = "id")

    )
    private Set<Tag> tags =new HashSet<>();


}
