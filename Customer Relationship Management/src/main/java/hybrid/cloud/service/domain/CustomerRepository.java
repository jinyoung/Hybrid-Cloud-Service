package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository
    extends PagingAndSortingRepository<Customer, java.lang.String> {}
