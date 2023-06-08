package hybrid.cloud.service.common;

import hybrid.cloud.service.SecurityManagementAndMonitoringApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SecurityManagementAndMonitoringApplication.class })
public class CucumberSpingConfiguration {}
