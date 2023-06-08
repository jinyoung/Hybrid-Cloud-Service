package hybrid.cloud.service.domain;

import hybrid.cloud.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "supportTickets",
    path = "supportTickets"
)
public interface SupportTicketRepository
    extends PagingAndSortingRepository<SupportTicket, java.lang.String> {}
