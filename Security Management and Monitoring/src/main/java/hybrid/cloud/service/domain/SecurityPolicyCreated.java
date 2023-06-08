package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SecurityPolicyCreated extends AbstractEvent {

    private java.lang.String policyId;

    public SecurityPolicyCreated(SecurityPolicy aggregate) {
        super(aggregate);
    }

    public SecurityPolicyCreated() {
        super();
    }
}
