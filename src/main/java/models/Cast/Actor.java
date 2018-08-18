package models.Cast;

import models.Award.Award;
import models.ICanWinAward;

import java.util.ArrayList;

public class Actor extends CastMember implements ICanWinAward {
    private ArrayList<Award> awards;

    public Actor(String firstName, String lastName, String nationality, boolean isFrontCredits) {
        super(firstName, lastName, nationality, isFrontCredits);
        this.awards = new ArrayList<Award>();
    }

    public ArrayList<Award> getAwards() {
        return awards;
    }

    public void winAward(Award award) {
        this.awards.add(award);

    }
}
