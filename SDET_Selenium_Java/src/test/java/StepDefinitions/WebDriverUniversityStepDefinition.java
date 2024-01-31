package StepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.webdriverunivesity.steps.WDUSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebDriverUniversityStepDefinition {
	
	

	private WebDriver driver;
	private WDUSteps stepsforWDU;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
	}
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
		@Then("User Launch chrome driver and open {string} url.")
		public void user_launch_chrome_driver_and_open_url(String url) {
			driver.get(url);
			driver.manage().window().maximize();
			stepsforWDU=new WDUSteps(driver);
			assertTrue(stepsforWDU.verifyTitle());
		}

		@When("User click on {string}")
		public void user_click_on(String elementToBeClicked) {
			stepsforWDU.clickIframe(elementToBeClicked);
		}
		
		@When("new tab has opened and switch to that tab.")
		public void new_tab_has_opened_and_switch_to_that_tab() {
		assertTrue(stepsforWDU.switchTab());
		}

		@Then("user able to see images change while clicking arrows.")
		public void user_able_to_see_images_change_while_clicking_arrows() throws InterruptedException {
			stepsforWDU.verifyImageChanges();
		}




}
