package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ServiceUpdated extends AbstractEvent {

    private java.lang.String serviceId;

    public ServiceUpdated(HybridCloudService aggregate) {
        super(aggregate);
    }

    public ServiceUpdated() {
        super();
    }
}
