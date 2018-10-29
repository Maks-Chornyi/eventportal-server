package portal.event.eventportal.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name="imageUrl")
    private String imageUrl;

    @Column(name="date")
    private Date date;

    @Column(name="place")
    private String place;

    Event() {}

    public Event(String title, String description, int id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public Event(String title, String description, String imageUrl, Date date, String place) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.date = date;
        this.place = place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
