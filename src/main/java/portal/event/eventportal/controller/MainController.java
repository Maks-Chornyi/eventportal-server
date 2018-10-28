package portal.event.eventportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import portal.event.eventportal.domain.Event;
import portal.event.eventportal.service.EventService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public void home(HttpServletResponse response) throws IOException {
        response.sendRedirect("event");
    }

    @GetMapping("/home")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/event/{id}")
    public Event getEventById(@PathVariable int id) {
        return eventService.getEventById(id);
    }

    @PostMapping("/event/{id}")
    public Event createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return event;
    }

    @PutMapping("/event/{id}")
    public Event updateEvent(@PathVariable int id, @RequestBody Event event) {
        return eventService.updateEvent(id,event);
    }
}
