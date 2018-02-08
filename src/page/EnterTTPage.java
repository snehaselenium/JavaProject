package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class EnterTTPage extends BasePage {
	
	
	
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutAT;
	
	@FindBy(css="span.productVersion")
	private WebElement version;
	
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeBTN;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public EnterTTPage(WebDriver driver)// CONSTRUCTOR
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickHelp() {
		help.click();
	}
	
	public void clickAboutActiTIME(WebDriver driver) {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(aboutAT).click().perform();;
		//aboutAT.click();
	}
	
	public void verifyVersion(String eText)
	{
		verifyText(version, eText); 
	}
	
	public void closeButton() {
		closeBTN.click();
	}

	public void clickLogout() {
		logoutLink.click();
	}
	

}
