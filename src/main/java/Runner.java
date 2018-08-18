import db.DBHelper;
import models.Award.*;
import models.Cast.Actor;
import models.Crew.Director;
import models.Crew.ProductionAssistant;
import models.Crew.ProductionManager;
import models.Crew.Writer;
import models.Film;
import models.Studio;

public class Runner {

    public static void main(String[] args) {
        Studio studio_1 = new Studio("Universal", 10000);
        DBHelper.save(studio_1);

        Writer writer_1 = new Writer("Bob", "Hoskins", "American","Karaoke movie" );

        Film film_1 = new Film("Lost in translation", writer_1.getScript(), 2000);
//        DBHelper.save(film_1);

        Director director_1 = new Director("Sofia", "Copolla", "American");

        Actor actor_1 = new Actor("Scarlett", "Johannson", "American", true);
        DBHelper.save(actor_1);

        ProductionManager manager_1 = new ProductionManager("Katie", "Wright", "English", "Leith");

        ProductionAssistant assistant_1 = new ProductionAssistant("Stuart", "Black", "Scottish");

        Oscar18 oscar_1 = new Oscar18(CategoriesType.DIRECTOR);
        Bafta18 bafta_1 = new Bafta18(CategoriesType.ACTOR);

//        Award.winningAward(oscar_1, director_1);
//        Award.winningAward(bafta_1, actor_1);

    }
}
