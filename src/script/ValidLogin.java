package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import generic.IAutoConstant;
import page.EnterTTPage;
import page.LoginPage;

public class ValidLogin extends BaseTest { 
	@Test(priority=1)
	public void testValidLogin() throws InterruptedException
	{
		String un=Excel.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw=Excel.getData(XL_PATH, "ValidLogin", 1, 1);
		String eTitle=Excel.getData(XL_PATH,"ValidLogin",1,2);
		
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		
		l.setPassword(pw);
		l.loginButton();
		
		EnterTTPage t=new EnterTTPage(driver);
		t.verifyPageIsDisplayed(driver,eTitle);	
	}

}
