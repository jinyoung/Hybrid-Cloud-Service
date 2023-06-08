package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DeleteCustomerCommand {

    private java.lang.String customerId;
}
