package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateCloudServiceIntegrationCommand {

    private java.lang.String integrationId;
    private java.lang.String integrationName;
    private java.lang.String cloudServiceProvider;
    private java.lang.String cloudServiceType;
    private java.lang.String connectionString;
    private java.lang.Boolean integrationStatus;
}
