import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/test_resource/feature"},
        glue = {"step_definition"},
        tags = "@TestLogin")
public class Runner {
}
