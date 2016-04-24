


	package pages;


	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class EditLeadPage extends OpentapsWrappers{

		public EditLeadPage() {

			if(verifyTitle("Edit Lead")){
				Reporter.reportStep("This is a Edit Lead page", "PASS");
			}

		}
		// Verify the username
		public EditLeadPage clearfirstname(String data){
			enterById(prop.getProperty("editlead.enterfirstname.Id"),data);
			return this;
		}
		public EditLeadPage updatename(String data){
			enterById(prop.getProperty("editlead.enterfirstname.Id"),data);
			return this;
		}
		
		public ViewLeadPage clickupdate(){
			clickByXpath(prop.getProperty("editlead.clickupdate.Xpath"));
			return new ViewLeadPage();
		}
	}



