package restApi.maidcc.demo.entity.dto;

import java.util.List;

/**
 *
 * @author Mhd-Sh
 */

public class SaleUpdateDto {


    private Long id;
    
    private List<SaleItemUpdateDto> itemAddDtos; 

    public SaleUpdateDto(Long id, List<SaleItemUpdateDto> itemAddDtos) {
        this.id = id;
        this.itemAddDtos = itemAddDtos;
    }

    public SaleUpdateDto() {
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SaleItemUpdateDto> getItemAddDtos() {
        return itemAddDtos;
    }

    public void setItemAddDtos(List<SaleItemUpdateDto> itemAddDtos) {
        this.itemAddDtos = itemAddDtos;
    }

   
   


 
}
