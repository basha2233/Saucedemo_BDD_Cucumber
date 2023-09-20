package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	

WebDriver driver = null;

@Given("browser is open")
public void browser_is_open() {
  System.out.println("browser open");
  //System.getProperty("Webdriver.chrome.driver","N:/Testing/Selenium2023June/Cucumber/src/test/resources/driver/chromedriver.exe");
  System.getProperty("Webdriver.chrome.driver","N:/Testing/Selenium2023June/Cucumber/src/test/resources/driver/chromedriver.exe");
  driver = new ChromeDriver();
}
@And("user is on google search page")
public void user_is_on_google_search_page() {
   
}

@When("user enters text on search bar") 	
public void user_enters_text_on_search_bar() {
    
}

@And("hits")
public void hits() {
   
}

@Then("user is navigated to page")
public void user_is_navigated_to_page() {
 
}

}
