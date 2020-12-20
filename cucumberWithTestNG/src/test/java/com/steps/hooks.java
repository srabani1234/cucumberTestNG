package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends base{

	@Before
	public void startBrowser() {
		base.initialization();
	}
@After
public void close(Scenario scenario) {

	if(scenario.isFailed()) {
final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

scenario.embed(screenShot, "targer/image.png");
	}
	driver.close();
	
}
}
