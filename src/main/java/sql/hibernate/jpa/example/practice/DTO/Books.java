package sql.hibernate.jpa.example.practice.DTO;

import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Author;

    @ManyToOne
    @JoinColumn
    private BookCataogary bookCataogary;

    public BookCataogary getBookCataogary() {
        return bookCataogary;
    }

    public void setBookCataogary(BookCataogary bookCataogary) {
        this.bookCataogary = bookCataogary;
    }

    public Books() {
    }

    public Books(String name, String author) {
        Name = name;
        Author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String autor) {
        Author = autor;
    }

    public Books(String name, String author, int bookCataogary) {
        Name = name;
        Author = author;
        this.bookCataogary=new BookCataogary();
        this.bookCataogary.setId(bookCataogary);
    }

    @Override
    public String toString() {
        return "Books{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
