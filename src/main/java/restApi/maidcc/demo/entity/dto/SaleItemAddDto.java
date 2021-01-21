package restApi.maidcc.demo.entity.dto;

import java.math.BigDecimal;

/**
 *
 * @author Mhd-Sh
 */
public class SaleItemAddDto {

    private Integer quantity;

    private Long productId;
    
    private Double price;

    public SaleItemAddDto(Integer quantity, Long productId, Double price) {
        this.quantity = quantity;
        this.productId = productId;
        this.price = price;
    }



    public SaleItemAddDto() {
    }
    
    

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
