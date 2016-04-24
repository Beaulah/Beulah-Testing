


	package pages;


	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class CreateLeadPage extends OpentapsWrappers{

		public CreateLeadPage() {

			if(!verifyTitle("Opentaps Open Source ERP + CRM")){
				Reporter.reportStep("This is NOT Home page", "FAIL");
			}

		}
		// Verify the username
		public CreateLeadPage verifyLoggedinUserName(String userName){
			verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), userName);
			return this;
		}
		
		public LoginPage clickLogout(){
			clickByClassName(prop.getProperty("Home.Logout.Class"));
			return new LoginPage();
		}
		
	}



