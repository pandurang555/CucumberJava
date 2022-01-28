package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\Features\\LoginParameter.feature",glue= {"stepDefinition"},
monochrome=true,
plugin = {"pretty","junit:target/JunitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/index.html"}

		)
public class TestRunner {
	
}
