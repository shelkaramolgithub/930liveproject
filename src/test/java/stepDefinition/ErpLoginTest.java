package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseutils.BaseUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ErpLoginTest {
	BaseUtils bu=new BaseUtils();
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    bu.startBrowser();
	}

	@When("^launch application$")
	public void launch_application() throws Throwable {
	    bu.launch();
	}

	@When("^enter valid username and valid password and click on login$")
	public void enter_valid_username_and_valid_password_and_click_on_login() throws Throwable {
	    bu.login();
	}

	@Then("^validate the login page$")
	public void validate_the_login_page() throws Throwable {
		String actres=bu.driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertTrue(actres.contains("Dashboard")); 
	}
	@When("^click on the logout button$")
	public void click_on_the_logout_button() throws Throwable {
	   bu.driver.findElement(By.id("mi_logout")).click(); 
	}

	@Then("^validate the logout$")
	public void validate_the_logout() throws Throwable {
	   bu.driver.close();
	}
	@When("^enter valid \"([^\"]*)\" and valid \"([^\"]*)\" and click on login$")
	public void enter_valid_and_valid_and_click_on_login(String uname, String pass) throws Throwable {
		bu.driver.findElement(By.id("username")).clear();
		bu.driver.findElement(By.id("username")).sendKeys("admin");
		bu.driver.findElement(By.id("password")).clear();
		bu.driver.findElement(By.id("password")).sendKeys("master");
		
		bu.driver.findElement(By.id("btnsubmit")).click();
		
	}

	@Then("^validate the login page with \"([^\"]*)\"$")
	public void validate_the_login_page_with(String expres) throws Throwable {
		String actres=bu.driver.findElement(By.id("ewPageCaption")).getText();
		Assert.assertEquals(actres, expres);
		bu.cloaseapp();
	}





}
