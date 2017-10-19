package pl.capgemini.db.dao;

import org.springframework.stereotype.Component;
import pl.capgemini.db.entities.Event;

@Component
public class HBaseEventsDao {
    public void save(Event event) {
        System.out.println(event.getDescription());
        //TODO: implement saving object
    }
}
