package Steps;

import Utils.Common;
import Utils.MyConstants;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep extends Common {
	
	@Before()
	public void browserSetup() {
		setDriver();
	}
	

	@Given("user is on login page")
	public void verifyLoginPage() {
		gotoPath(getProperty("APP_URL"));
	}
	
	@When("^user enters (.*) and (.*)$")
	public void userEnters(String username,String password) {
		setFieldByXpath(MyConstants.lpUsername, username);
		setFieldByXpath(MyConstants.lpPassword, password);
	}

	@And("click on login button")
	public void clickLogin() {
		clickElementByXpath(MyConstants.lpSignBtn);
	}
	
}
