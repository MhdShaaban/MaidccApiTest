package restApi.maidcc.demo.entity.dto;

import java.util.Date;
import restApi.maidcc.demo.entity.*;

/**
 *
 * @author Mhd-Sh
 */

public class ProductDto {

    private Long id;
    private String name;

    private String description;

    private String category;
    
    private Date creationDate;

    public ProductDto(Long id, String name, String description, String category, Date creationDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.creationDate = creationDate;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    
    
    

}
