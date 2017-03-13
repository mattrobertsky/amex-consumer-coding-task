package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the Consumer application for the Amex coding challenge. It receives Events 
 * and inserts them into a local Mongodb instance using the database name defined in 
 * application.properties and the collection defined in the EventsRepository interface.
 * 
 * It responds with the location of the submitted Event e.g.
 * 
 *   http://localhost:8080/events/58b574861b8a61268e5368fd
 * 
 * It can be used to query the eventsRepo database e.g.
 *  
 *   curl http://localhost:8080/events
 * 
 * And to search for a specific event using the URI returned e.g. 
 * 
 *   curl http://localhost:8080/events/search/findById?Id=...
 * 
 * It is based on the Spring guide here:
 * 
 *   https://spring.io/guides/gs/accessing-mongodb-data-rest/
 * 
 * And is intentionally a Hypermedia Rest service, see: 
 * 
 *   https://spring.io/guides/tutorials/bookmarks/
 * 
 * @author matt
 *
 */
@SpringBootApplication // TODO figure out what this annotation does
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
