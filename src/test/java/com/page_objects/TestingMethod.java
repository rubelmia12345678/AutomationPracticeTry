/*
 * package com.page_objects;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.PageFactory; import
 * org.openqa.selenium.support.ui.Select; import org.testng.annotations.Test;
 * 
 * public class TestingMethod {
 * 
 * @Test public void login() throws InterruptedException {
 * 
 * System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://automationpractice.com/index.php"); Thread.sleep(500);
 * 
 * PageFactoryObjects pf = PageFactory.initElements(driver,
 * PageFactoryObjects.class); pf.getSignIn().get(0).click();
 * pf.getEmail().get(0).sendKeys("jahirultech86@gmail.com");
 * pf.getPassword().get(0).sendKeys("sunday2019");
 * pf.getsignButton().get(0).click();
 * 
 * pf.getDress().get(0).click();
 * 
 * Select select = new Select(pf.getdrpDwn().get(0));
 * select.selectByVisibleText("Price: Highest first");
 * 
 * driver.quit(); }
 * 
 * }
 */