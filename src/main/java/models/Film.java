package models;

import models.Cast.CastMember;
import models.Crew.CrewMember;

import java.util.ArrayList;

public class Film {
    private String title;
    private String script;
    private int budget;
    private ArrayList<CastMember> cast;
    private ArrayList<CrewMember> crew;

    public Film(String title, String script, int budget) {
        this.title = title;
        this.script = script;
        this.budget = budget;
        this.cast = new ArrayList<CastMember>();
        this.crew = new ArrayList<CrewMember>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ArrayList<CastMember> getCast() {
        return cast;
    }

    public void setCast(ArrayList<CastMember> cast) {
        this.cast = cast;
    }

    public ArrayList<CrewMember> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<CrewMember> crew) {
        this.crew = crew;
    }



    public void addPersonToFilm(CastMember person){ //if adding cast member
        this.cast.add(person);
    }

    public void removePersonFromFilm(CastMember person){
        this.cast.remove(person);
    }

    public void addPersonToFilm(CrewMember person){ // if adding crew
        this.crew.add(person);
    }

    public void removePersonFromFilm(CrewMember person){
        this.crew.remove(person);
    }
}
