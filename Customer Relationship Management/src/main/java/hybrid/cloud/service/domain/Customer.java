package hybrid.cloud.service.domain;

import hybrid.cloud.service.CustomerRelationshipManagementApplication;
import hybrid.cloud.service.domain.CustomerCreated;
import hybrid.cloud.service.domain.CustomerDeleted;
import hybrid.cloud.service.domain.CustomerUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Customer_table")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String customerId;

    private java.lang.String customerName;

    private java.lang.String customerEmail;

    private java.lang.String customerPhone;

    private java.lang.String customerCompany;

    @PostPersist
    public void onPostPersist() {
        CustomerCreated customerCreated = new CustomerCreated(this);
        customerCreated.publishAfterCommit();

        CustomerUpdated customerUpdated = new CustomerUpdated(this);
        customerUpdated.publishAfterCommit();

        CustomerDeleted customerDeleted = new CustomerDeleted(this);
        customerDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = CustomerRelationshipManagementApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }
}
