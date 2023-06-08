package hybrid.cloud.service.infra;

import hybrid.cloud.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SecurityPolicyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SecurityPolicy>> {

    @Override
    public EntityModel<SecurityPolicy> process(
        EntityModel<SecurityPolicy> model
    ) {
        return model;
    }
}
