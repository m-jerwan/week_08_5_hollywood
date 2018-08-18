package models.Crew;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.persistence.*;

@Entity
@Table(name = "production members")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ProductionMember extends CrewMember {

    public ProductionMember() {}
    public ProductionMember(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }


}
