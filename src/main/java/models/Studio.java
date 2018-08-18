package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "studios")
public class Studio {
    private int id;
    private String name;
    private int budget;
    private ArrayList<Film> films;

    public Studio() {
    }

    public Studio(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.films = new ArrayList<Film>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

//    public ArrayList<Film> getFilms() {
//        return films;
//    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film){
        this.films.add(film);
    }

    public void removeFilms(Film film){
        this.films.remove(film);
    }
}
