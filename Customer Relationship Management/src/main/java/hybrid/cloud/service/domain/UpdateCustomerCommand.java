package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateCustomerCommand {

    private java.lang.String customerId;
    private java.lang.String customerName;
    private java.lang.String customerEmail;
    private java.lang.String customerPhone;
    private java.lang.String customerCompany;
}
