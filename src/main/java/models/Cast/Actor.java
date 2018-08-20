package models.Cast;

import models.Award.Award;
import models.ICanWinAward;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "actors")
public class Actor implements ICanWinAward {
    private int id;
    private String firstName;
    private String lastName;
    private String nationality;
    private boolean isFrontCredits;
//    private ArrayList<Award> awards;

    public Actor() {
    }

    public Actor(String firstName, String lastName, String nationality, boolean isFrontCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.isFrontCredits = isFrontCredits;
//        this.awards = new ArrayList<Award>();
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

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Column(name = "front_credits")
    public boolean getFrontCredits(){
        return this.isFrontCredits;
    }

    public void setFrontCredits(boolean frontCredits) {
        isFrontCredits = frontCredits;
    }

//    public ArrayList<Award> getAwards() {
//        return awards;
//    }
//
//    public void setAwards(ArrayList<Award> awards) {
//        this.awards = awards;
//    }

    public String nameForCredits(){
        return this.firstName+" "+this.lastName;
    }

//    public void winAward(Award award) {
//        this.awards.add(award);
//    }
}
