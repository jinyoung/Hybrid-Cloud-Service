package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CustomerDeleted extends AbstractEvent {

    private java.lang.String customerId;

    public CustomerDeleted(Customer aggregate) {
        super(aggregate);
    }

    public CustomerDeleted() {
        super();
    }
}
