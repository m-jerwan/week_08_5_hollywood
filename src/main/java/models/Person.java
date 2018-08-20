package models;

import models.Award.Award;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

//TODO move all common to actor and crew member constructor and methods HERE

@Entity
@Table(name="people")
public class Person {
    private int id;
    private List<Award> awards;
    private boolean isFrontCredits;


    public Person() {
    }

    public Person(boolean isFrontCredits) {
        this.isFrontCredits = isFrontCredits;
        this.awards = new ArrayList<Award>();
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

    @OneToMany(mappedBy = "winner", fetch = FetchType.LAZY)
    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public void winAward(Award award){
        this.awards.add(award);
    }

    @Column(name = "front_credits")
    public boolean getFrontCredits(){
        return this.isFrontCredits;
    }

    public void setFrontCredits(boolean frontCredits) {
        isFrontCredits = frontCredits;
    }
}
