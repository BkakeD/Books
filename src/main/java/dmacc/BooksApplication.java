package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Book;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.BookRepository;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	
	@Autowired
	BookRepository repo;

	@Override
	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book b = appContext.getBean("book", Book.class);
		repo.save(b);
		
		List<Book> allMyBooks = repo.findAll();
		for (Book story : allMyBooks) {
			System.out.println(story.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}