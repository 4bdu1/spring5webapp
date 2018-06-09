package a4bdul.springframework.spring5webapp.repositories;

import a4bdul.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 4bdul on 09/06/2018 at 11:55 AM.
 */
public interface BookRepository extends CrudRepository<Book,Long>{
}
