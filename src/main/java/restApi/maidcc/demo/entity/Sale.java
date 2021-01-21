package restApi.maidcc.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/**
 *
 * @author Mhd-Sh
 */
@Entity
public class Sale extends BaseEntity {
    
    @Column(nullable = false)
    private String seller;
    
    @Column
    private Double total;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Client client;
    
    @OneToMany(mappedBy = "sale" )
    @JsonIgnore
    private List<SaleItem> items = new ArrayList<>();
    
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
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

    public List<SaleItem> getItems() {
        return items;
    }

    public void setItems(List<SaleItem> items) {
        this.items = items;
    }
        
}
