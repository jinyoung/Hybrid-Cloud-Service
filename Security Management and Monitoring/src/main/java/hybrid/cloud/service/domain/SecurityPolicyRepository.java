package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "securityPolicies",
    path = "securityPolicies"
)
public interface SecurityPolicyRepository
    extends PagingAndSortingRepository<SecurityPolicy, java.lang.String> {}
