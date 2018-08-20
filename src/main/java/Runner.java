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

        Film film_1 = new Film("Lost in translation", "Karaoke movie", 2000);
        DBHelper.save(film_1);

        Writer writer_1 = new Writer("Mike", "McMike", "British","Karaoke movie" );
        writer_1.setFilm(film_1);
        DBHelper.save(writer_1);

        Director director_1 = new Director("Sofia", "Copolla", "American");
        director_1.setFilm(film_1);
        DBHelper.save(director_1);

        Actor actor_1 = new Actor("Scarlett", "Johannson", "American", true);
        Actor actor_2 = new Actor("Bob", "Hoskings", "American", true);
        Actor actor_3 = new Actor("Han", "Huango", "Japanese", false);
        actor_1.setFilm(film_1);
        actor_2.setFilm(film_1);
        actor_3.setFilm(film_1);
        DBHelper.save(actor_1);
        DBHelper.save(actor_2);
        DBHelper.save(actor_3);

        film_1.addPersonToFilm(actor_1);    //adding people to AL<Actors> in film is pointless in DB.
        film_1.addPersonToFilm(actor_2);
        film_1.addPersonToFilm(actor_3);
        DBHelper.update(film_1);

        Oscar oscar_1 = new Oscar(CategoriesType.DIRECTOR);
        Award.winningAward(oscar_1, director_1);

//        DBHelper.save(oscar_1);
//        Bafta bafta_1 = new Bafta(CategoriesType.ACTOR);
//        DBHelper.save(bafta_1);

//        Award.winningAward(bafta_1, actor_1);



        ProductionManager manager_1 = new ProductionManager("Katie", "Wright", "English", "Leith");
//        DBHelper.save(manager_1);

        ProductionAssistant assistant_1 = new ProductionAssistant("Stuart", "Black", "Scottish");
//        DBHelper.save(assistant_1);


    }
}
