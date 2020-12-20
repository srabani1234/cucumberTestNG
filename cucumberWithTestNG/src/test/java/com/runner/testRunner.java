package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberExceptionWrapper;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features= {"F:\\Practice\\cucumberWithTestNG\\src\\test\\java\\resource"},
		glue= {"com\\steps"},
		tags= "@login",
		strict=true,//check all the feature file implemented or not
		dryRun=false,// check mapping inbetween feature steps and ste defination
		monochrome= true,
				plugin= {"pretty", "junit:target/cucumber-reports/Cucumber.xml",
		"rerun:target/rerurnScenarios.txt"}
		
		)
public class testRunner extends AbstractTestNGCucumberTests {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass
	public void setUpClass() throws Exception{
		
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups= {"cucumber"}, description= "Runs cucumber feature", dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features(){
		  if (testNGCucumberRunner == null) {
	            return new Object[0][0];
	        }
		return testNGCucumberRunner.provideFeatures();
		
	}
	
	@AfterClass
	public void tearDownClass() {
		   if (testNGCucumberRunner == null) {
	            return;
	        }
		testNGCucumberRunner.finish();
	}
}
