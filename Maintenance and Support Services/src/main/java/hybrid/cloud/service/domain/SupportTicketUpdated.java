package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SupportTicketUpdated extends AbstractEvent {

    private java.lang.String ticketId;

    public SupportTicketUpdated(SupportTicket aggregate) {
        super(aggregate);
    }

    public SupportTicketUpdated() {
        super();
    }
}
