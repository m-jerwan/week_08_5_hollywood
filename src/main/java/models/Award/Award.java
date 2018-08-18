package models.Award;

public abstract class Award {
    private String category;
    private String country;
    private ICanWinAward winner;

    public Award(String category, String country, ICanWinAward winner) {
        this.category = category;
        this.country = country;
        this.winner = winner;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public ICanWinAward getWinner() {
        return winner;
    }

    public void setWinner(ICanWinAward winner) {
        this.winner = winner;
    }
}
