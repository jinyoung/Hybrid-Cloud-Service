package hybrid.cloud.service.common;

import hybrid.cloud.service.CustomerRelationshipManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerRelationshipManagementApplication.class })
public class CucumberSpingConfiguration {}
