package hybrid.cloud.service.infra;

import hybrid.cloud.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CloudServiceIntegrationHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<CloudServiceIntegration>> {

    @Override
    public EntityModel<CloudServiceIntegration> process(
        EntityModel<CloudServiceIntegration> model
    ) {
        return model;
    }
}
