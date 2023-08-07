package sql.hibernate.jpa.example.practice.DTO;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Set;

@Entity
public class BookCataogary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String Language;

    public BookCataogary() {
    }

    public BookCataogary(String language) {
        Language = language;
    }

    public BookCataogary(String language, Set<Books> booksSet) {
        Language = language;
        this.booksSet = booksSet;
        this.booksSet.forEach(x->x.setBookCataogary(this));
    }

    @OneToMany(mappedBy = "bookCataogary",cascade = CascadeType.ALL)
    private Set<Books> booksSet;

    public Set<Books> getBooksSet() {
        return booksSet;
    }

    public void setBooksSet(Set<Books> booksSet) {
        this.booksSet = booksSet;
    }

    public BookCataogary(int id, String language) {
        Id = id;
        Language = language;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }


    @Override
    public String toString() {
        return "BookCataogary{" +
                "Id=" + Id +
                ", Language='" + Language + '\'' +
                '}';
    }
}
