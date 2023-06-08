package hybrid.cloud.service.infra;

import hybrid.cloud.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class HybridCloudServiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<HybridCloudService>> {

    @Override
    public EntityModel<HybridCloudService> process(
        EntityModel<HybridCloudService> model
    ) {
        return model;
    }
}
