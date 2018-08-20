package models.Award;

import javax.persistence.*;

@Entity
@Table(name = "awards")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Award {
    private int id;
    private CategoriesType category;
    private String country;
//    private CastMember winner;

    public Award(CategoriesType category, String country) {
        this.category = category;
        this.country = country;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Enumerated(value = EnumType.STRING)
    public CategoriesType getCategory(){
        return this.category;
    }

//    @Column(name = "winner")
//    public CastMember getWinner() {
//        return winner;
//    }
//
//    public void setWinner(CastMember winner) {
//        this.winner = winner;
//    }

    public void setCategory(CategoriesType category) {
        this.category = category;
    }

    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public void engraveWinner(CastMember winner){
//        this.winner = winner;
//    }

//    public static void winningAward(Award award, Person person){
//        winner.winAward(award);
//        award.engraveWinner(winner);
//    }



}
