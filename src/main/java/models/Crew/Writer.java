package models.Crew;

import models.Award.Award;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
@Entity
@Table(name = "writers")
public class Writer extends CrewMember  {
    private ArrayList<Award> awards;
    private  String script;

    public Writer() {
    }
    public Writer(String firstName, String lastName, String nationality, String script) {
        super(firstName, lastName, nationality);
        this.script = script;
        this.awards = new ArrayList<Award>();
    }

    @Column(name = "script")
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
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
