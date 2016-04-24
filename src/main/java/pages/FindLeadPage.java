


	package pages;


	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class FindLeadPage extends OpentapsWrappers{

		public FindLeadPage() {

			if(verifyTitle("Find Leads")){
				Reporter.reportStep("This is a Find Lead page", "PASS");
			}

		}
		// Verify the username
		public FindLeadPage entercompany(String data){
			enterByXpath(prop.getProperty("editlead.Companyname.Xpath"), data );
			return this;
		}
		
		public FindLeadPage clickfind(){
			clickByXpath(prop.getProperty("editlead.findlead.Xpath"));
			return this;
		}
		public ViewLeadPage clickname(){
			clickByLink(prop.getProperty("editlead.clickname.link"));
			return new ViewLeadPage();
		}
		
	}



