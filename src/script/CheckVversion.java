package script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.LoginPage;

public class CheckVversion extends BaseTest{
	
	@Test(priority=3)
	public void testCheckVversion() throws InterruptedException
	{
		// taking from excel
		String un=Excel.getData(XL_PATH, "CheckVversion", 1, 0);
		String pw=Excel.getData(XL_PATH, "CheckVversion", 1, 1);
		String homePage=Excel.getData(XL_PATH,"CheckVversion",1,2);
		String version=Excel.getData(XL_PATH, "CheckVversion", 1, 3);
		
		//enter valid username
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
	
		//enter valid password
		l.setPassword(pw);
		Thread.sleep(2000);
		
		//click on login button
		l.loginButton();
		Thread.sleep(2000);
		
		//verify homepage is displayed
		EnterTTPage t=new EnterTTPage(driver);
		t.verifyPageIsDisplayed(driver,homePage);
		Thread.sleep(5000);
		
		
		//click on help
		t.clickHelp();
		Thread.sleep(2000);
		
		//click on about your actitime  : moved mouse to "about ur actitime" using actions class den perfomed click
		t.clickAboutActiTIME(driver);
		Thread.sleep(2000);
		
		//verify product version
		t.verifyVersion(version);
		Thread.sleep(2000);
		
		//close pop up
		t.closeButton();
		Thread.sleep(2000);
		
		//click logout
		t.clickLogout();
	}

}
