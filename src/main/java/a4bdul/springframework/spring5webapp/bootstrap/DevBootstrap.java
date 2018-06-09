package a4bdul.springframework.spring5webapp.bootstrap;

import a4bdul.springframework.spring5webapp.model.Author;
import a4bdul.springframework.spring5webapp.model.Book;
import a4bdul.springframework.spring5webapp.model.Publisher;
import a4bdul.springframework.spring5webapp.repositories.AuthorRepository;
import a4bdul.springframework.spring5webapp.repositories.BookRepository;
import a4bdul.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by 4bdul on 09/06/2018 at 12:00 PM.
 */

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    private void initData(){

        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher ericPublisher = new Publisher("Harper Collins","12th Street, LA");
        publisherRepository.save(ericPublisher);

        Book ddd = new Book("Domain Driven Design", "1234",ericPublisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);



        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher rodPublisher = new Publisher("Wrox","another address");
        publisherRepository.save(rodPublisher);

        Book noEJB = new Book("J2EE Development without EJB", "23444", rodPublisher);

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);



    }


}
