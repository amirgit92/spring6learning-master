//package com.amir.spring6learning.bootstrap;
//
//import com.amir.spring6learning.domain.Author;
//import com.amir.spring6learning.domain.Book;
//import com.amir.spring6learning.domain.Publisher;
//import com.amir.spring6learning.repositories.PublisherRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import com.amir.spring6learning.repositories.AuthorRepository;
//import com.amir.spring6learning.repositories.BookRepository;
//
//@Component
//public class BootstrapData implements CommandLineRunner {
//
//    private  final AuthorRepository authorRepository;
//    private  final BookRepository bookRepository;
//    private final PublisherRepository publisherRepository;
//
//    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
//        this.authorRepository = authorRepository;
//        this.bookRepository = bookRepository;
//        this.publisherRepository = publisherRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Author author1 = new Author();
//        Author author2 = new Author();
//        author1.setFirstName("Eric");
//        author1.setLastName("Evans");
//        author2.setFirstName("Rod");
//        author2.setLastName("Johnson");
//        Author eric = authorRepository.save(author1);
//        Author rod = authorRepository.save(author2);
//
//        Publisher publisher = new Publisher();
//        publisher.setPublisherName("my publisher");
//        publisher.setAddress("a random address");
//        Publisher savedPublisher = publisherRepository.save(publisher);
//
//        Book book1 = new Book();
//        Book book2 = new Book();
//        book1.setTitle("Domain Driven Design");
//        book1.setIsbn("123456");
//        book1.setPublisher(savedPublisher);
//        book2.setTitle("J2EE Development without EJB");
//        book2.setIsbn("654321");
//        book2.setPublisher(savedPublisher);
//        Book book1Saved = bookRepository.save(book1);
//        Book book2Saved = bookRepository.save(book2);
//
//        eric.getBooks().add(book1Saved);
//        rod.getBooks().add(book2Saved);
//        book1Saved.getAuthors().add(eric);
//        book2Saved.getAuthors().add(rod);
//
//        authorRepository.save(eric);
//        authorRepository.save(rod);
//        bookRepository.save(book1);
//        bookRepository.save(book2);
//
//        System.out.println("In Bootstrap");
//        System.out.println("Author Count: " + authorRepository.count());
//        System.out.println("Book Count: " + bookRepository.count());
//        System.out.println("Publisher Count: "+ publisherRepository.count());
//    }
//}
