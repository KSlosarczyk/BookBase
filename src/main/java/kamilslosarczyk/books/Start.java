package kamilslosarczyk.books;


import kamilslosarczyk.books.entity.Author;
import kamilslosarczyk.books.entity.Book;
import kamilslosarczyk.books.entity.BookCategory;
import kamilslosarczyk.books.repo.AuthorRepo;
import kamilslosarczyk.books.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Start {

    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    @Autowired
    public Start(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;

        //Saving to datababse
        //1
        Book book1 = new Book();
        book1.setBookCategory(BookCategory.DRAMA);
        book1.setTitle("Hello Boy");
        book1.setIsbn("98888299-21514521-2321");
        //2
        Book book2 = new Book();
        book2.setBookCategory(BookCategory.COMEDY);
        book2.setTitle("Sanity is for you, Boy");
        book2.setIsbn("98888299-21514521-2321");
        //3
        Book book3 = new Book();
        book3.setBookCategory(BookCategory.COMEDY);
        book3.setTitle("Stellajh Boy");
        book3.setIsbn("98888299-21514521-2321");
        //4
        Book book4 = new Book();
        book4.setBookCategory(BookCategory.COMEDY);
        book4.setTitle("Hajin is not an object, Boy");
        book4.setIsbn("98888299-21514521-2321");
        //5
        Book book5 = new Book();
        book5.setBookCategory(BookCategory.DRAMA);
        book5.setTitle("See you later, Boy");
        book5.setIsbn("98888299-21514521-2321");

        Author author = new Author();
        author.setName("Kamil");
        author.setSurname("Slosarczyk");
        author.setBookSet(Stream.of(book1, book2, book3, book4, book5).collect(Collectors.toSet()));

        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);
        bookRepo.save(book4);
        bookRepo.save(book5);


        authorRepo.save(author);
    }
}
