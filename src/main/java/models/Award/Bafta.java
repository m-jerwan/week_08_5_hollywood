package models.Award;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "baftas")
public class Bafta extends Award{


    public Bafta(CategoriesType category) {
        super(category, "UK" );
    }
}
