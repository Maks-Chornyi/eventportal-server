package portal.event.eventportal.service;

import portal.event.eventportal.domain.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();

    void createEvent(Event event);

    Event getEventById(int id);

    Event updateEvent(int id, Event event);
}
