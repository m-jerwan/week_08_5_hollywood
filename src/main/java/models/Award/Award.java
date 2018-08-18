package models.Award;

import models.ICanWinAward;

public abstract class Award {
    private CategoriesType category;
    private String country;
    private ICanWinAward winner;

    public Award(CategoriesType category, String country) {
        this.category = category;
        this.country = country;
    }

    public CategoriesType getCategory(){
        return this.category;
    }

    public void setCategory(CategoriesType category) {
        this.category = category;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void ingraveWinner(ICanWinAward winner){
        this.winner = winner;
    }

    public static void winningAward(Award award, ICanWinAward winner){
        winner.winAward(award);
        award.ingraveWinner(winner);
    }



}
