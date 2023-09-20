package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	private By txtusername=By.id("user-name");
	private By txtpassword = By.id("password");
	private By txtlogin=By.id("login-button");
	private By txtproduct = By.xpath("By.xpath(\"//div[contains(@class,'header_secondary_container')]/span[contains(@class,'title')]\")");
	
	public loginPage(WebDriver driver)
	{
	   this.driver= driver;	
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txtusername).sendKeys(username);
	}
	public void enterpassword(String password)
	{
		driver.findElement(txtpassword).sendKeys(password);
	}

	public void enterlogin()
	{
		driver.findElement(txtlogin).click();
	}
	
	public void products_display()
	{
		driver.findElement(txtproduct).isDisplayed();
	}
	
	public void validLogin(String username, String password)
	{
		driver.findElement(By.id("user-name")).sendKeys(username);	  
		   driver.findElement(By.id("password")).sendKeys(password);
		   driver.findElement(By.id("login-button")).click();
	}


}
