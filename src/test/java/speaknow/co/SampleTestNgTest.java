package speaknow.co;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import speaknow.co.pages.HomePage;

import java.io.IOException;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }

  @Test
  public void MoreInfoPresentTest () throws IOException, InterruptedException {
    driver.get("http://speaknow.co/#home");
    homepage.waiForHompageIsLoaded();
    Assert.assertTrue(homepage.isMoreInfoVisible(),"More Info button is invisible");
  }
}
