package restApi.maidcc.demo.entity.dto;

import java.math.BigDecimal;

/**
 *
 * @author Mhd-Sh
 */
public class SaleItemUpdateDto {

    private Integer quantity;

    private Long id;
    
    private Double price;

    public SaleItemUpdateDto(Integer quantity, Long id, Double price) {
        this.quantity = quantity;
        this.id = id;
        this.price = price;
    }

    public SaleItemUpdateDto() {
    }

    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
    
}
