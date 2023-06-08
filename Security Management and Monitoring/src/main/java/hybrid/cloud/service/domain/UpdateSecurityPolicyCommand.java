package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateSecurityPolicyCommand {

    private java.lang.String policyId;
    private java.lang.String policyName;
    private java.lang.String policyDescription;
    private java.lang.Boolean policyEnforcement;
    private java.lang.String policyType;
}
