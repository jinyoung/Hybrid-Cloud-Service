package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DeleteCloudServiceIntegrationCommand {

    private java.lang.String integrationId;
}
