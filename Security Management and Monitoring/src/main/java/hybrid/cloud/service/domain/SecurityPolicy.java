package hybrid.cloud.service.domain;

import hybrid.cloud.service.SecurityManagementAndMonitoringApplication;
import hybrid.cloud.service.domain.SecurityPolicyCreated;
import hybrid.cloud.service.domain.SecurityPolicyDeleted;
import hybrid.cloud.service.domain.SecurityPolicyUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SecurityPolicy_table")
@Data
public class SecurityPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String policyId;

    private java.lang.String policyName;

    private java.lang.String policyDescription;

    private java.lang.Boolean policyEnforcement;

    private java.lang.String policyType;

    @PostPersist
    public void onPostPersist() {
        SecurityPolicyCreated securityPolicyCreated = new SecurityPolicyCreated(
            this
        );
        securityPolicyCreated.publishAfterCommit();

        SecurityPolicyUpdated securityPolicyUpdated = new SecurityPolicyUpdated(
            this
        );
        securityPolicyUpdated.publishAfterCommit();

        SecurityPolicyDeleted securityPolicyDeleted = new SecurityPolicyDeleted(
            this
        );
        securityPolicyDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SecurityPolicyRepository repository() {
        SecurityPolicyRepository securityPolicyRepository = SecurityManagementAndMonitoringApplication.applicationContext.getBean(
            SecurityPolicyRepository.class
        );
        return securityPolicyRepository;
    }
}
