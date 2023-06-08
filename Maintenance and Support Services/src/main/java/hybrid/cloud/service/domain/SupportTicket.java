package hybrid.cloud.service.domain;

import hybrid.cloud.service.MaintenanceAndSupportServicesApplication;
import hybrid.cloud.service.domain.SupportTicketCreated;
import hybrid.cloud.service.domain.SupportTicketDeleted;
import hybrid.cloud.service.domain.SupportTicketUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SupportTicket_table")
@Data
public class SupportTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String ticketId;

    private java.lang.String customerId;

    private java.lang.String ticketSeverity;

    private java.lang.String ticketDescription;

    private java.lang.String ticketStatus;

    @PostPersist
    public void onPostPersist() {
        SupportTicketCreated supportTicketCreated = new SupportTicketCreated(
            this
        );
        supportTicketCreated.publishAfterCommit();

        SupportTicketUpdated supportTicketUpdated = new SupportTicketUpdated(
            this
        );
        supportTicketUpdated.publishAfterCommit();

        SupportTicketDeleted supportTicketDeleted = new SupportTicketDeleted(
            this
        );
        supportTicketDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SupportTicketRepository repository() {
        SupportTicketRepository supportTicketRepository = MaintenanceAndSupportServicesApplication.applicationContext.getBean(
            SupportTicketRepository.class
        );
        return supportTicketRepository;
    }
}
