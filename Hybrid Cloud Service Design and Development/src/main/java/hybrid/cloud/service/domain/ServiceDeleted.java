package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ServiceDeleted extends AbstractEvent {

    private java.lang.String serviceId;

    public ServiceDeleted(HybridCloudService aggregate) {
        super(aggregate);
    }

    public ServiceDeleted() {
        super();
    }
}
