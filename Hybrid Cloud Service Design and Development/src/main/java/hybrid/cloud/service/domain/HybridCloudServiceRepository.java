package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "hybridCloudServices",
    path = "hybridCloudServices"
)
public interface HybridCloudServiceRepository
    extends PagingAndSortingRepository<HybridCloudService, java.lang.String> {}
