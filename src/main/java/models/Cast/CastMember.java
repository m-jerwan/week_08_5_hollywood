package models.Cast;

import models.ICredits;

public abstract class CastMember implements ICredits {
    private String firstName;
    private String lastName;
    private String nationality;
    private boolean isFrontCredits;

    public CastMember(String firstName, String lastName, String nationality, boolean isFrontCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.isFrontCredits = isFrontCredits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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



}
