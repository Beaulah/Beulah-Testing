package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_EditLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC02_EditLead";
		testCaseName 	= "TC01A -EditLead(POM)";
		testDescription = "Login to Opentaps using POM framework and Edit Lead";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginAndEitLead(String username,String password,String Companyname, String NewFirstName) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clcikonCMSFA()
		.clickleadtab()
		.clickfindlead()
		.entercompany(Companyname)
		.clickfind()
		.clickname()
		.clickedit()
		.clearfirstname("")
		.updatename(NewFirstName)
		.clickupdate();
	}
}
