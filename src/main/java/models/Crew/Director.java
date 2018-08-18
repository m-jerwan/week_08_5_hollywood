package models.Crew;

import models.Award.Award;
import models.ICanWinAward;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "directors")
public class Director extends CrewMember implements ICanWinAward {
    private ArrayList<Award> awards;

    public Director() {
    }
    public Director(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
        this.awards = new ArrayList<Award>();
    }

//    public ArrayList<Award> getAwards() {
//        return awards;
//    }

    public void setAwards(ArrayList<Award> awards) {
        this.awards = awards;
    }

    public void winAward(Award award) {
        this.awards.add(award);
    }
}
