 package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.page_objects.PageFactoryObjects;
import com.util.DynamicWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsOfLoginFeature {
	WebDriver driver;
	PageFactoryObjects pf;
	
	@Before//cucumber hooks
	public void open_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("^Enter the \"([^\"]*)\"$")
	public void enter_the(String URL) throws Throwable {
		driver.get(URL);
		String page_title = driver.getTitle();
		System.out.println("This is Title :" + page_title);
		// String expected_title = "My Store";
		Assert.assertTrue(page_title.contains("My Store"));
		// Assert.assertEquals(page_title, extected_title);
		System.out.println("varified tittle");
	}

	@When("^Click on sign in$")
	public void click_on_sign_in() throws Throwable {
		pf = PageFactory.initElements(driver, PageFactoryObjects.class);
		pf.getSignIn().get(0).click();

	}

	@When("^Enter userEmail \"([^\"]*)\"$")
	public void enter_userEmail(String email) throws Throwable {
		pf.getEmail().get(0).sendKeys(email);
	}

	@When("^Enter the userPass \"([^\"]*)\"$")
	public void enter_the_userPass(String password) throws Throwable {
		pf.getEmail().get(0).sendKeys(password);
	}

	@When("^Click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
		pf.getSignButton().get(0).click();

	}

	@When("^In home page click on Dresses$")
	public void in_home_page_click_on_Dresses() throws Throwable {
		pf.getDressesBtn().get(0).click();

	}

	@When("^Click on Sort by dropdown manu$")
	public void click_on_Sort_by_dropdown_manue() throws Throwable {

		Select select = new Select(pf.getDrpDwn().get(0));
		select.selectByVisibleText("Price: Highest first");
	}

	@When("^Select the second dress$")
	public void select_the_second_dress() throws Throwable {

		pf.getAllDress().get(1).click();

//		if (pf.getProcced().size() > 0) {
//			pf.getProcced().get(0).click();
//		}

		try {
			pf.getProcced().get(0).click();
		} catch (Exception e) {

		}

	}

	@When("^go to next page and add to cart$")
	public void go_to_next_page_and_add_to_cart() throws Throwable {

		pf.getAddToCart().get(0).click();

	}

	@Then("^validate total price$")
	public void validate_total_price() throws Throwable {

		try {		

			DynamicWait.getExplicitWait(driver, pf.getProcced().get(0));

			pf.getProcced().get(0).click();
			
		} catch (Exception e) {

		}

		Assert.assertEquals(pf.getTotalPrice().get(0).getText(), "$52.99");

	}

	@After//cucumber hooks
	public void close_the_window_and_logout() throws Throwable {
		driver.quit();

	}

}
