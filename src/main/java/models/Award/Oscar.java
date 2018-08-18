package models.Award;

public abstract class Oscar extends Award {

    public Oscar(String category, ICanWinAward winner) {
        super(category,"US" ,winner);
    }
}
