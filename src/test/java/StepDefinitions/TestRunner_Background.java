package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Background/Background.feature",glue={"Stepdeficitions_Background"},monochrome = true
,plugin={"pretty","html:target/HtmlReports"})
public class TestRunner_Background {

}
