package com.testrunner;

import org.junit.runner.RunWith;

import com.pageobjectmanager.com.Cucumber_Adactin_POM.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\richa\\eclipse-workspace\\Cucumber_Adactin_POM\\src\\test\\java\\com\\featurefile"
				,glue = {"com.stepdefinition"}
				,dryRun = false
				,monochrome = true
				,strict = true
				,format= {"pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"})

public class Test_Runner extends BaseClass {
	
}
