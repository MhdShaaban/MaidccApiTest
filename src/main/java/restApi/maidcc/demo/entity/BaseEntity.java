package restApi.maidcc.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.Version;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;

/**
 *
 * @author Mhd-Sh
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Version
    @Column
    @ColumnDefault("0")
    private Integer version;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @CreatedDate
    private Date creationDate= new Date();
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
