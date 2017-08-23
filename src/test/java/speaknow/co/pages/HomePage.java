package speaknow.co.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(xpath="//*[@id='slogan']/h2")
  public WebElement header;

  @FindBy(xpath = "//div[@class='more-info-btn']")
  public WebElement moreInfoButton;




  public HomePage(WebDriver webDriver) {
    super(webDriver);
    PageFactory.initElements(driver, this);
  }

  // mothods that interact with elements
  public HomePage clickToMoreInfo (){
    clickElement(moreInfoButton);
    return this;
  }

  //Wait methods
  public HomePage waiForHompageIsLoaded () throws IOException, InterruptedException {
    waitUntilElementIsLoaded(header);
    return this;
  }


  //Checks for assert

  public boolean isMoreInfoVisible(){
    return exists(moreInfoButton);
  }
}
