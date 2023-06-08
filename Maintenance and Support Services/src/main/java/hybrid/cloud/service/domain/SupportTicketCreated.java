package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import hybrid.cloud.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SupportTicketCreated extends AbstractEvent {

    private java.lang.String ticketId;

    public SupportTicketCreated(SupportTicket aggregate) {
        super(aggregate);
    }

    public SupportTicketCreated() {
        super();
    }
}
