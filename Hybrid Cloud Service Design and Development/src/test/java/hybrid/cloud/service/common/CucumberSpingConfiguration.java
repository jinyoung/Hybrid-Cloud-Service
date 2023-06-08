package hybrid.cloud.service.common;

import hybrid.cloud.service.HybridCloudServiceDesignAndDevelopmentApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
    classes = { HybridCloudServiceDesignAndDevelopmentApplication.class }
)
public class CucumberSpingConfiguration {}
