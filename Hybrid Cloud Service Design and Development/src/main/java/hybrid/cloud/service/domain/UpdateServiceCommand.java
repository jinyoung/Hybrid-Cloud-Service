package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateServiceCommand {

    private java.lang.String serviceId;
    private java.lang.String serviceName;
    private java.lang.String serviceProvider;
    private java.lang.String serviceType;
    private java.lang.String serviceDescription;
}
