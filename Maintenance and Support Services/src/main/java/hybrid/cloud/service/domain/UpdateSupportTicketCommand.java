package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateSupportTicketCommand {

    private java.lang.String ticketId;
    private java.lang.String ticketSeverity;
    private java.lang.String ticketDescription;
    private java.lang.String ticketStatus;
}
