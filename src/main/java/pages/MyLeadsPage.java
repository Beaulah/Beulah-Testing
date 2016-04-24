


	package pages;


	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class MyLeadsPage extends OpentapsWrappers{

		public MyLeadsPage() {

			if(verifyTitle("My Leads")){
				Reporter.reportStep("This is a Home page", "PASS");
			}

		}
		// Verify the username
		public FindLeadPage clickfindlead(){
			clickByLink(prop.getProperty("editlead.findlead.Link"));
			return new FindLeadPage();
		}
		
	}



