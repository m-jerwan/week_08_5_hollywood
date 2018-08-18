package models.Crew;

import models.Award.ICanWinAward;

public class DirectorOfPhotography extends Crew implements ICanWinAward {
    public DirectorOfPhotography(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }
}
