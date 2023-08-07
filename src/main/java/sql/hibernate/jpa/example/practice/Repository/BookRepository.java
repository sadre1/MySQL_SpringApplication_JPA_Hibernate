package sql.hibernate.jpa.example.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sql.hibernate.jpa.example.practice.DTO.Books;

import java.util.List;

public interface BookRepository extends JpaRepository<Books,Integer> {
//    @Query(value = "select * from books b where b.Id=:Id",nativeQuery = true)
      Books findById(int Id);
//    @Query(value = "select * from books b where b.author=:name",nativeQuery = true)
//    Books findByAuthor(String name);
}
