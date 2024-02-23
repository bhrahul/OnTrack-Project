
package testrunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/com/features/LoginPage.feature"}, //how to read folder path
               glue = { "stepdefinitions", "AppHooks"},

               plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber-reports.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
               
           
               monochrome= true,publish=true
            )
//@Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests {
	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}
	
}