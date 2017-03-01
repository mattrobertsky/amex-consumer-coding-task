package consumer;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventsRepository extends MongoRepository<Events, String> {

  // this allows you to search using the id supplied to the producer as URI
  // on the end of the location URL
  List<Events> findById(@Param("Id") String id);
}
