package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/FeatureWithTags",
glue= {"stepDefinition"},
tags= "@smoke or @regression and @important"
		)
public class TestRunner_RunWithSingleTag {
	
}
