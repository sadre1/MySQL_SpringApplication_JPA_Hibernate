package sql.hibernate.jpa.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sql.hibernate.jpa.example.practice.DTO.BookCataogary;
import sql.hibernate.jpa.example.practice.DTO.Books;
import sql.hibernate.jpa.example.practice.Repository.BookRepository;
import sql.hibernate.jpa.example.practice.Repository.BooksCatagryReposetory;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}


	private final BookRepository bookRepository;
	private final BooksCatagryReposetory booksCatagryReposetory;

	public PracticeApplication(BookRepository bookRepository, BooksCatagryReposetory booksCatagryReposetory) {
		this.bookRepository = bookRepository;
		this.booksCatagryReposetory = booksCatagryReposetory;
	}





	@Override
	public void run(String... args) throws Exception {
		Set<Books> books = new HashSet<>();
//		Books b1 = new Books("CSS","Herry Potter");
		Books b2 = new Books("Java","Oracel",1);
//		books.add(b1);
		books.add(b2);
		bookRepository.saveAll(books);

//		booksCatagryReposetory.save(new BookCataogary("Programming Book"));
//		booksCatagryReposetory.save(new BookCataogary(" Non-Programming Book",books));


	}
}
