package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CustomerCreated extends AbstractEvent {

    private java.lang.String customerId;

    public CustomerCreated(Customer aggregate) {
        super(aggregate);
    }

    public CustomerCreated() {
        super();
    }
}
