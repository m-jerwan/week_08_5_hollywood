package models.Cast;

import models.Award.ICanWinAward;

public class Actor extends CastMember implements ICanWinAward {

    public Actor(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }

}
