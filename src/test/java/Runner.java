import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {})
public class Runner {

}
//        plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr.html"}
