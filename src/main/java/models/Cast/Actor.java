package models.Cast;

import models.Award.Award;
import models.Film;
import models.Person;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "actors")
public class Actor extends Person {
    private String firstName;
    private String lastName;
    private String nationality;
    private boolean isFrontCredits;
    private Film film;

    public Actor() {
    }

    public Actor(String firstName, String lastName, String nationality, boolean isFrontCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.isFrontCredits = isFrontCredits;
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

    @Column(name = "front_credits")
    public boolean getFrontCredits(){
        return this.isFrontCredits;
    }

    public void setFrontCredits(boolean frontCredits) {
        isFrontCredits = frontCredits;
    }

    public String nameForCredits(){
        return this.firstName+" "+this.lastName;
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
