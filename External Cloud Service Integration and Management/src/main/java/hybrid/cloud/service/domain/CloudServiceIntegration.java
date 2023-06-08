package hybrid.cloud.service.domain;

import hybrid.cloud.service.ExternalCloudServiceIntegrationAndManagementApplication;
import hybrid.cloud.service.domain.CloudServiceIntegrated;
import hybrid.cloud.service.domain.CloudServiceIntegrationDeleted;
import hybrid.cloud.service.domain.CloudServiceIntegrationUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CloudServiceIntegration_table")
@Data
public class CloudServiceIntegration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String integrationId;

    private java.lang.String integrationName;

    private java.lang.String cloudServiceProvider;

    private java.lang.String cloudServiceType;

    private java.lang.String connectionString;

    private java.lang.Boolean integrationStatus;

    @PostPersist
    public void onPostPersist() {
        CloudServiceIntegrated cloudServiceIntegrated = new CloudServiceIntegrated(
            this
        );
        cloudServiceIntegrated.publishAfterCommit();

        CloudServiceIntegrationUpdated cloudServiceIntegrationUpdated = new CloudServiceIntegrationUpdated(
            this
        );
        cloudServiceIntegrationUpdated.publishAfterCommit();

        CloudServiceIntegrationDeleted cloudServiceIntegrationDeleted = new CloudServiceIntegrationDeleted(
            this
        );
        cloudServiceIntegrationDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CloudServiceIntegrationRepository repository() {
        CloudServiceIntegrationRepository cloudServiceIntegrationRepository = ExternalCloudServiceIntegrationAndManagementApplication.applicationContext.getBean(
            CloudServiceIntegrationRepository.class
        );
        return cloudServiceIntegrationRepository;
    }
}
