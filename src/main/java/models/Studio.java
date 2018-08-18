package models;

import java.util.ArrayList;

public class Studio {
    private int budget;
    private ArrayList<Film> films;

    public Studio(int budget) {
        this.budget = budget;
        this.films = new ArrayList<Film>();
    }


    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

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
