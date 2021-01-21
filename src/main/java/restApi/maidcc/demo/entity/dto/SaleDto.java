package restApi.maidcc.demo.entity.dto;
/**
 *
 * @author Mhd-Sh
 */

public class SaleDto {

    private Long id;
    private String seller;

    private Double total;

    private String client;        

    public SaleDto(Long id, String seller, Double total, String client) {
        this.id = id;
        this.seller = seller;
        this.total = total;
        this.client = client;       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
 
}
