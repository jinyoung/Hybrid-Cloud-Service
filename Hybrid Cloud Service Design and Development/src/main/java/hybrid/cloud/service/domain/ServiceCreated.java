package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ServiceCreated extends AbstractEvent {

    private java.lang.String serviceId;

    public ServiceCreated(HybridCloudService aggregate) {
        super(aggregate);
    }

    public ServiceCreated() {
        super();
    }
}
