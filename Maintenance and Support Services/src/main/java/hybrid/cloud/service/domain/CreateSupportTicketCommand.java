package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateSupportTicketCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String ticketId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String customerId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String ticketSeverity;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String ticketDescription;
}
