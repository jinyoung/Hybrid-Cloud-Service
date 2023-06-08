package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class IntegrateCloudServiceCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String integrationId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String integrationName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String cloudServiceProvider;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String cloudServiceType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String connectionString;
}
