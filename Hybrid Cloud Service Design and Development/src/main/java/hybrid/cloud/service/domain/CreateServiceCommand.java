package hybrid.cloud.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateServiceCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String serviceId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String serviceName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String serviceProvider;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String serviceType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String serviceDescription;
}
