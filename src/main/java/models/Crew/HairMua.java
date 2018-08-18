package models.Crew;

import models.Award.ICanWinAward;

public class HairMua extends Crew implements ICanWinAward {
    public HairMua(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }
}
