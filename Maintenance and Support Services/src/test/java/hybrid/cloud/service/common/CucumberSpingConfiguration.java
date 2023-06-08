package hybrid.cloud.service.common;

import hybrid.cloud.service.MaintenanceAndSupportServicesApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MaintenanceAndSupportServicesApplication.class })
public class CucumberSpingConfiguration {}
