package restApi.maidcc.demo.entity.dto;


/**
 *
 * @author Mhd-Sh
 */

public class ProductUpdateDto {

    private Long id;
    private String name;

    private String description;

    private Long categoryId;
    
     
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    
    
  
    
  
    
    
    

}
