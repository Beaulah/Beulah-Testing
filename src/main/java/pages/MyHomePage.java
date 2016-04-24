


	package pages;


	import utils.Reporter;
	import wrappers.OpentapsWrappers;

	public class MyHomePage extends OpentapsWrappers{

		public MyHomePage() {

			if(verifyTitle("My Home")){
				Reporter.reportStep("This is a Home page", "PASS");
			}

		}
		// Verify the username
		public MyLeadsPage clickleadtab(){
			clickByLink(prop.getProperty("editlead.Leads.Links"));
			return new MyLeadsPage();
		}
		
	}



