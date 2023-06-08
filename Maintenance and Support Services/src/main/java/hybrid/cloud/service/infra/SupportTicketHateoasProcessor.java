package hybrid.cloud.service.infra;

import hybrid.cloud.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SupportTicketHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SupportTicket>> {

    @Override
    public EntityModel<SupportTicket> process(
        EntityModel<SupportTicket> model
    ) {
        return model;
    }
}
