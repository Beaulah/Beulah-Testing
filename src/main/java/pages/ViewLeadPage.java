


	package pages;


	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class ViewLeadPage extends OpentapsWrappers{

		public ViewLeadPage() {

			if(verifyTitle("View Lead")){
				Reporter.reportStep("This is a View Lead page", "PASS");
			}

		}
		// Verify the username
		public EditLeadPage clickedit(){
			clickByXpath(prop.getProperty("editlead.clickedit.Xpath") );
			return new EditLeadPage();
		}
		
		
		
	}



