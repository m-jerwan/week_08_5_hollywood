package models.Crew;

import models.Award.ICanWinAward;

public class Editing extends Crew implements ICanWinAward {
    public Editing(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }
}
