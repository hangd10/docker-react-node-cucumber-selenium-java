package dscj.stepFiles;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

// docker seleninum/hub
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePage {
	WebDriver driver;
	
	@Before
	public void setup() throws MalformedURLException {
		// local
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver-2.37");
		this.driver = new ChromeDriver();

		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	
	// @Before
	// public void setup_firefox() {
	// 	System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
	// 	FirefoxOptions firefoxOptions = new FirefoxOptions();
	// 	firefoxOptions.setCapability("marionette", true);
	// 	this.driver = new FirefoxDriver(firefoxOptions);
	// 	this.driver.manage().window().maximize();
	// 	this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	// 	this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	// }
	
	@After
	public void tearDown() throws InterruptedException {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^User navigates to (.*)$")
	public void user_navigates_to_website(String website) throws Throwable {
		driver.get(website);
	}

	@When("^User clicks on (.*) tab$")
	public void user_clicks_on_tab(String tabName) throws Throwable {
		int navItemIndex = 0;
		switch(tabName) {
			case "MenuItems": navItemIndex = 1; break;

			case "Features": navItemIndex = 2; break;

			default: System.out.println("No matching tab for tabName [" +tabName+ "]");
		}

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/nav/div[" +navItemIndex+ "]/a")).click();
	}

	@Then("^User should be taken to the (.*) page successfully$")
	public void user_should_be_taken_to_the_successful_page(String tabName) throws Throwable {
		Thread.sleep(1000);
		WebElement pageHeader = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/content/div/h1"));

		Assert.assertEquals(true, pageHeader.isDisplayed());
	}
}
