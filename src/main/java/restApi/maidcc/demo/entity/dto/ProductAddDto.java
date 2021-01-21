package restApi.maidcc.demo.entity.dto;


/**
 *
 * @author Mhd-Sh
 */

public class ProductAddDto {
  
    private String name;

    private String description;

    private Long categoryId;
    
     private Double price;
     
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
  
    
  
    
    
    

}
