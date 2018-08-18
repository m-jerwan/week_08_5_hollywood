package models.Cast;

import models.Award.Award;
import models.ICanWinAward;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "actors")
public class Actor extends CastMember implements ICanWinAward {
    private int id;
    private ArrayList<Award> awards;

    public Actor(String firstName, String lastName, String nationality, boolean isFrontCredits) {
        super(firstName, lastName, nationality, isFrontCredits);
        this.awards = new ArrayList<Award>();
    }

//
//    public ArrayList<Award> getAwards() {
//        return awards;
//    }

    public void winAward(Award award) {
        this.awards.add(award);

    }
}
