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
	public void verifyLoginPage() throws InterruptedException {
		logInfo("Page loaded successfully");
		gotoPath(getProperty("APP_URL"));
	}
	
	@When("^user enters (.*) and (.*)$")
	public void userEnters(String username,String password) {
		logInfo("Enter Username "+username);
		setFieldByXpath(MyConstants.lpUsername, username);
		logInfo("Enter Password "+password);
		setFieldByXpath(MyConstants.lpPassword, password);
	}

	@And("click on login button")
	public void clickLogin() {
		clickElementByXpath(MyConstants.lpSignBtn);
		logInfo("Signed In Successfully");
	}
	
}
