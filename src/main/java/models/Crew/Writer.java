package models.Crew;

import models.Award.ICanWinAward;


public class Writer extends Crew implements ICanWinAward {
    private  String script;


    public Writer(String firstName, String lastName, String nationality, String script) {
        super(firstName, lastName, nationality);
        this.script = script;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }
}
