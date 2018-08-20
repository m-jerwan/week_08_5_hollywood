package models.Crew;

import models.Film;
import models.Person;

import javax.persistence.*;

@Entity
@Table(name = "crew_members")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CrewMember extends Person {
    private String firstName;
    private String lastName;
    private String nationality;
    private Film film;

    public CrewMember() {
    }

    public CrewMember( String firstName, String lastName, String nationality) {
        super(true);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}
