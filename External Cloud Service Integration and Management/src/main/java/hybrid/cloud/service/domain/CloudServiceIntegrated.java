package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CloudServiceIntegrated extends AbstractEvent {

    private java.lang.String integrationId;

    public CloudServiceIntegrated(CloudServiceIntegration aggregate) {
        super(aggregate);
    }

    public CloudServiceIntegrated() {
        super();
    }
}
