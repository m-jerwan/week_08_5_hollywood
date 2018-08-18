package models.Crew;

import models.Award.ICanWinAward;

public class Music extends Crew implements ICanWinAward {
    private String score;

    public Music(String firstName, String lastName, String nationality, String score) {
        super(firstName, lastName, nationality);
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
