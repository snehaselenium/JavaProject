package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public void verifyPageIsDisplayed(WebDriver driver,String eResult)
	{
		String sETO=AutoUtil.getProperty(IAutoConstant.CONFIG_PATH, "ETO");
		long ETO=Long.parseLong(sETO);
		
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		try
		{
			wait.until(ExpectedConditions.titleIs(eResult));
			Reporter.log("PASSS : Expected page is displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("FAIL : Expected page is NOT  displayed",true);
			Assert.fail();
		}
	}
	
	public void verifyText(WebElement e,String eText)
	{
		String aText=e.getText();
		Assert.assertEquals(aText, eText);
	}

}
