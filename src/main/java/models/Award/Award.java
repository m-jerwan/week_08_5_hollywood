package models.Award;

import models.Cast.Actor;
import models.Person;

import javax.persistence.*;

@Entity
@Table(name = "awards")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Award {
    private int id;
    private CategoriesType category;
    private String country;
    private Person winner;

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

    @ManyToOne
    @JoinColumn(name = "award_id", nullable = false)
    public Person getWinner() {
        return winner;
    }

    public void setWinner(Person winner) {
        this.winner = winner;
    }

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

    public void engraveWinner(Person winner){
        this.winner = winner;
    }

    public static void winningAward(Award award, Person person){
        person.winAward(award);
        award.engraveWinner(person);
    }



}
