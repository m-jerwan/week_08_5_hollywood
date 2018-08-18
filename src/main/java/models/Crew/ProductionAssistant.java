package models.Crew;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "production assistants")
public class ProductionAssistant extends ProductionMember {

    public ProductionAssistant() {
    }

    public ProductionAssistant(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }

    public String getCoffee(){
        return "Flat white comming!";
    }



}
