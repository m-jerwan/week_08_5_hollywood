package models.Award;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "oscars")
public class Oscar extends Award {

    public Oscar(CategoriesType category) {
        super(category,"US");
    }
}
