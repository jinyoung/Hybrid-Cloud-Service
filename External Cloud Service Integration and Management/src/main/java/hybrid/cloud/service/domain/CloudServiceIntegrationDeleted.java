package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CloudServiceIntegrationDeleted extends AbstractEvent {

    private java.lang.String integrationId;

    public CloudServiceIntegrationDeleted(CloudServiceIntegration aggregate) {
        super(aggregate);
    }

    public CloudServiceIntegrationDeleted() {
        super();
    }
}
