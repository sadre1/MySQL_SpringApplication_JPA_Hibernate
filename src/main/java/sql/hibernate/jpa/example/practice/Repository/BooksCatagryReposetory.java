package sql.hibernate.jpa.example.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sql.hibernate.jpa.example.practice.DTO.BookCataogary;

public interface BooksCatagryReposetory extends JpaRepository<BookCataogary,Integer> {

}
