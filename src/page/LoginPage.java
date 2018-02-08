package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage{
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy (name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void loginButton()
	{
		loginBTN.click();
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void verifyErrMsg(String eText)
	{
		verifyText(errMsg, eText); 
	}
}
