package pl.capgemini.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.capgemini.db.dao.HBaseEventsDao;

@Component
public class MessageService {

    @Autowired
    private HBaseEventsDao eventsDao;

    public void saveEvent(String message) {
        System.out.println(message);
    }
}
