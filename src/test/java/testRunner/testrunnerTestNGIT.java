package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "steps",
tags="@Gmail")
public class testrunnerTestNGIT extends AbstractTestNGCucumberTests {

}
