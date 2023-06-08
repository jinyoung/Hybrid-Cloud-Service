package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateSecurityPolicyCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String policyId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String policyName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String policyDescription;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.Boolean policyEnforcement;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String policyType;
}
