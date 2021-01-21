package restApi.maidcc.demo.entity.dto;

import java.util.List;

/**
 *
 * @author Mhd-Sh
 */

public class SaleAddDto {


    private String seller;


    private Long clientId;
    
    private List<SaleItemAddDto> itemAddDtos; 

    public SaleAddDto(String seller, Long clientId, List<SaleItemAddDto> itemAddDtos) {
        this.seller = seller;
        this.clientId = clientId;
        this.itemAddDtos = itemAddDtos;
    }

    public SaleAddDto() {
    }
    
    
    

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }



    public List<SaleItemAddDto> getItemAddDtos() {
        return itemAddDtos;
    }

    public void setItemAddDtos(List<SaleItemAddDto> itemAddDtos) {
        this.itemAddDtos = itemAddDtos;
    }



   

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }


 
}
