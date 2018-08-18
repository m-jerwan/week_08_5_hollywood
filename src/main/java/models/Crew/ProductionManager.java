package models.Crew;

public class ProductionManager extends Production {
    private String officeLocation;

    public ProductionManager(String firstName, String lastName, String nationality, String officeLocation) {
        super(firstName, lastName, nationality);
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
