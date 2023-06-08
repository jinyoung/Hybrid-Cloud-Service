package hybrid.cloud.service.domain;

import hybrid.cloud.service.HybridCloudServiceDesignAndDevelopmentApplication;
import hybrid.cloud.service.domain.ServiceCreated;
import hybrid.cloud.service.domain.ServiceDeleted;
import hybrid.cloud.service.domain.ServiceUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "HybridCloudService_table")
@Data
public class HybridCloudService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String serviceId;

    private java.lang.String serviceName;

    private java.lang.String serviceProvider;

    private java.lang.String serviceType;

    private java.lang.String serviceDescription;

    @PostPersist
    public void onPostPersist() {
        ServiceCreated serviceCreated = new ServiceCreated(this);
        serviceCreated.publishAfterCommit();

        ServiceUpdated serviceUpdated = new ServiceUpdated(this);
        serviceUpdated.publishAfterCommit();

        ServiceDeleted serviceDeleted = new ServiceDeleted(this);
        serviceDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static HybridCloudServiceRepository repository() {
        HybridCloudServiceRepository hybridCloudServiceRepository = HybridCloudServiceDesignAndDevelopmentApplication.applicationContext.getBean(
            HybridCloudServiceRepository.class
        );
        return hybridCloudServiceRepository;
    }
}
