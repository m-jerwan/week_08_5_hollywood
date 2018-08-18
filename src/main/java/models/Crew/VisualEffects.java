package models.Crew;

import models.Award.ICanWinAward;

public class VisualEffects extends Crew implements ICanWinAward {
    public VisualEffects(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }
}
