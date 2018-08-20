package models.Crew;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directors")
public class Director extends CrewMember {

    public Director() {
    }
    public Director(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);

    }


}
