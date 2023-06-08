package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateCustomerCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String customerId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String customerName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String customerEmail;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String customerPhone;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String customerCompany;
}
