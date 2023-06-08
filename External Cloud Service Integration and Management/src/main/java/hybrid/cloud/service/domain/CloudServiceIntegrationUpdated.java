package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CloudServiceIntegrationUpdated extends AbstractEvent {

    private java.lang.String integrationId;

    public CloudServiceIntegrationUpdated(CloudServiceIntegration aggregate) {
        super(aggregate);
    }

    public CloudServiceIntegrationUpdated() {
        super();
    }
}
