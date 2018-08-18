package models.Cast;

import models.ICredits;

import javax.persistence.*;

@Entity
@Table(name = "cast_members")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CastMember implements ICredits {
    private int id;
    private String firstName;
    private String lastName;
    private String nationality;
    private boolean isFrontCredits;

    public CastMember() {
    }

    public CastMember(String firstName, String lastName, String nationality, boolean isFrontCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.isFrontCredits = isFrontCredits;
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

    public boolean isFrontCredits(){
        return this.isFrontCredits;
    }

    public String nameForCredits(){
        return this.getFirstName()+" "+this.lastName;
    }

    public void setFrontCredits(boolean frontCredits) {
        isFrontCredits = frontCredits;
    }
}
