package models.Crew;

import models.Award.Award;
import models.ICanWinAward;

import java.util.ArrayList;


public class Writer extends CrewMember implements ICanWinAward {
    private ArrayList<Award> awards;
    private  String script;


    public Writer(String firstName, String lastName, String nationality, String script) {
        super(firstName, lastName, nationality);
        this.script = script;
        this.awards = new ArrayList<Award>();
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public ArrayList<Award> getAwards() {
        return awards;
    }

    public void setAwards(ArrayList<Award> awards) {
        this.awards = awards;
    }

    public void winAward(Award award) {
        this.awards.add(award);

    }
}
