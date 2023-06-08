package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CustomerUpdated extends AbstractEvent {

    private java.lang.String customerId;

    public CustomerUpdated(Customer aggregate) {
        super(aggregate);
    }

    public CustomerUpdated() {
        super();
    }
}
