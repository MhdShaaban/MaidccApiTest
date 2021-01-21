package restApi.maidcc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Mhd-Sh
 */
@Entity
public class Category extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
