package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "cloudServiceIntegrations",
    path = "cloudServiceIntegrations"
)
public interface CloudServiceIntegrationRepository
    extends
        PagingAndSortingRepository<CloudServiceIntegration, java.lang.String> {}
