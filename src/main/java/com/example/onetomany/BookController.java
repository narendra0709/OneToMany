package com.example.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/onetomany")
public class BookController {
	@Autowired
	BookRepository bookRepository;

    @GetMapping("/book")
    public List<Book> read() {
        List<Book> books = (List<Book>) bookRepository.findAll();
        books.forEach(b -> System.out.println(
            String.format("%s, %s",b.getTitle(),b.getIsbn() )
        ));
		return books;
    }
    

}
