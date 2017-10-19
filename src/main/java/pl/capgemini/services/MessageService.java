package pl.capgemini.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.capgemini.db.dao.HBaseEventsDao;
import pl.capgemini.db.entities.Event;

@Component
public class MessageService {

    @Autowired
    private HBaseEventsDao eventsDao;

    public void saveEvent(String message) {
        Event event = new Event();
        event.setDescription(message);
        eventsDao.save(event);
    }
}
