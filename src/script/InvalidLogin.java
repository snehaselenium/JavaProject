package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest {
	
	@Test(priority=2)
	public void testInvalidLogin() 
	{
		String un=Excel.getData(XL_PATH,"InvalidLogin", 1, 0);
		String pw=Excel.getData(XL_PATH,"InvalidLogin", 1, 1);
		String msg=Excel.getData(XL_PATH,"InvalidLogin",1,2);
		
		LoginPage l1=new LoginPage(driver);
		l1.setUsername(un);
		
		l1.setPassword(pw);
		l1.loginButton();
		
		l1.verifyErrMsg(msg);
	}

}
