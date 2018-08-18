package models.Crew;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "production_managers")
public class ProductionManager extends ProductionMember {
    private String officeLocation;

    public ProductionManager() {
    }
    public ProductionManager(String firstName, String lastName, String nationality, String officeLocation) {
        super(firstName, lastName, nationality);
        this.officeLocation = officeLocation;
    }
    @Column(name = "office_location")
    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }


}
