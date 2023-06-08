package hybrid.cloud.service.common;

import hybrid.cloud.service.ExternalCloudServiceIntegrationAndManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
    classes = { ExternalCloudServiceIntegrationAndManagementApplication.class }
)
public class CucumberSpingConfiguration {}
