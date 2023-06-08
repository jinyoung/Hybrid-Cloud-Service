package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SecurityPolicyUpdated extends AbstractEvent {

    private java.lang.String policyId;

    public SecurityPolicyUpdated(SecurityPolicy aggregate) {
        super(aggregate);
    }

    public SecurityPolicyUpdated() {
        super();
    }
}
