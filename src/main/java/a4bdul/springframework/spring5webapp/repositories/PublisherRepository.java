package a4bdul.springframework.spring5webapp.repositories;

import a4bdul.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 4bdul on 09/06/2018 at 12:13 PM.
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
