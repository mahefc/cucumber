package Steps;

import Utils.Common;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class ProjectStep extends Common{
	
	@Before()
	public void browserSetup() {
		setDriver();
	}
	
	@Then("navigate to home page")
	public void navigate_to_home_page() throws InterruptedException {
		waitFortheElement("//mat-icon[text()='event_available']");
		Thread.sleep(2000);
		closeDriver();

	}
		
}
