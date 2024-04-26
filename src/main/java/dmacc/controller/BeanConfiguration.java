package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Book;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book("King of the Bastion", "Hayden Hayfield", "000-0123456789", 200);
		return bean;
	}
}
