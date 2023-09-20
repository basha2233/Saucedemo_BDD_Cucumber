package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username1;
	
	@FindBy(id="password")
	WebElement password1;
	
	@FindBy(id="login-button")
	WebElement login1;
	
	@FindBy(xpath="//div[contains(@class,'header_secondary_container')]/span[contains(@class,'title')]")
	WebElement product;
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		username1.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password1.sendKeys(password);
	}

	public void click()
	{
		login1.click();
	}

	public void displayProduct()
	{
		product.isDisplayed();
	}


}
