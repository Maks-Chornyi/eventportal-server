package portal.event.eventportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portal.event.eventportal.domain.Event;
import portal.event.eventportal.exception.NotFoundException;
import portal.event.eventportal.repository.EventRepository;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Event getEventById(int id) {
        return eventRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Event updateEvent(int id, Event event) {
        Event newEvent = this.getEventById(id);
        newEvent.setTitle(event.getTitle());
        newEvent.setDescription(event.getDescription());
        return newEvent;
    }

    @Override
    public void deleteEvent(int id){
        this.eventRepository.deleteById(id);
    }
}