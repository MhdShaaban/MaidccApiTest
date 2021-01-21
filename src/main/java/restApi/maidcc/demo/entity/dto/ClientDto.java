package restApi.maidcc.demo.entity.dto;
/**
 *
 * @author Mhd-Sh
 */

public class ClientDto {

    private Long id;
    private String name;

    private String lastname;

    private String mobile;        

    public ClientDto(Long id, String name, String lastname, String mobile) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.mobile = mobile;       
    }
    
    

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
   

   


    
    
    

}
