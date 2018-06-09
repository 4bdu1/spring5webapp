package a4bdul.springframework.spring5webapp.repositories;

import a4bdul.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 4bdul on 09/06/2018 at 11:53 AM.
 */
public interface AuthorRepository extends CrudRepository<Author,Long>{
}
