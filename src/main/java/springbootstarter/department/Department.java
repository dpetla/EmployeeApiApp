package springbootstarter.department;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *  Entity class that Hibernate will use to create a table in the db
 */
@Entity
public class Department {

    @Id
    private String id;

    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
