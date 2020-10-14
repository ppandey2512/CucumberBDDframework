package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinitions"},
  monochrome=true,
  plugin= {"pretty","junit:target/JunitReports/report.xml",
		"json:target/JsonReport",
		"html:target/HtmlReports"},
  tags="@smoketest")



public class TestRunner {

}
