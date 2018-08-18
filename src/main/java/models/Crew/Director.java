package models.Crew;

import models.Award.ICanWinAward;

public class Director extends Crew implements ICanWinAward {

    public Director(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }
}
