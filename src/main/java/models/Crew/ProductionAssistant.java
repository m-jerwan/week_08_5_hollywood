package models.Crew;

public class ProductionAssistant extends Production{

    public ProductionAssistant(String firstName, String lastName, String nationality) {
        super(firstName, lastName, nationality);
    }

    public String getCoffee(){
        return "Flat white comming!";
    }

}
