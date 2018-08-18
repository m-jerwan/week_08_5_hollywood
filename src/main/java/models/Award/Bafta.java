package models.Award;

public abstract class Bafta extends Award{

    public Bafta(String category, ICanWinAward winner) {
        super(category, "UK" , winner);
    }
}
