package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SecurityPolicyDeleted extends AbstractEvent {

    private java.lang.String policyId;

    public SecurityPolicyDeleted(SecurityPolicy aggregate) {
        super(aggregate);
    }

    public SecurityPolicyDeleted() {
        super();
    }
}
