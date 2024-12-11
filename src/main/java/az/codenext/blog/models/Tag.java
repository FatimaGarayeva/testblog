package az.codenext.blog.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String seoUrl;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name ="articel_tags",
            joinColumns = @JoinColumn(name = "tags",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "articels",referencedColumnName = "id")

    )
    private Set<Articel> articels = new HashSet<>();
}
