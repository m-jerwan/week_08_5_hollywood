package models.Crew;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "writers")
public class Writer extends CrewMember  {
    private  String script;

    public Writer() {
    }
    public Writer(String firstName, String lastName, String nationality, String script) {
        super(firstName, lastName, nationality);
        this.script = script;
//        this.awards = new ArrayList<Award>();
    }

    @Column(name = "script")
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

}
