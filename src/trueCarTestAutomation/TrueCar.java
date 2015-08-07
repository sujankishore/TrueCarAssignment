package trueCarTestAutomation;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;


public class TrueCar {
  public WebDriver driver;
  public String baseUrl;
  public StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://autoblog.truecar.com";
driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTrueCar() throws Exception {
 
    driver.get(baseUrl);
    
    //Home Page 
    HomePage.dropdwnbx_Make(driver).click();
    HomePage.txtbx_Search(driver).sendKeys("Lincoln");
    HomePage.lnk_Make(driver).click();
    HomePage.dropdwnbx_Model(driver).click();
    HomePage.txtbx_Search(driver).sendKeys("MKS");
    HomePage.lnk_Model(driver).click();
    HomePage.txtbx_ZipCode(driver).clear();
    HomePage.txtbx_ZipCode(driver).sendKeys("90405");
    HomePage.btn_Go(driver).click();

    //Price Report page 
    PriceReportPage.dropdwnbx_Style(driver).click();
    PriceReportPage.txtbx_Search(driver).sendKeys("3.5L EcoBoost AWD");
    PriceReportPage.lnk_Style(driver).click();
    PriceReportPage.btn_EditOptions(driver).click();    
    PriceReportPage.chkbx_Options(driver).click();
    PriceReportPage.btn_SaveAndUpdate(driver).click();
    PriceReportPage.btn_EditIncentives(driver).click();
    PriceReportPage.chkbx_Incentives(driver).click();
    PriceReportPage.btn_SaveAndUpdate(driver).click();   
    PriceReportPage.btn_Next(driver).click();

    //Registration page   
    RegistrationPage.txtbx_FirstName(driver).clear();
    RegistrationPage.txtbx_FirstName(driver).sendKeys("XXXXXXX");
    RegistrationPage.txtbx_LastName(driver).clear();
    RegistrationPage.txtbx_LastName(driver).sendKeys("ZZZZZZZ");
    RegistrationPage.txtbx_Address(driver).clear();
    RegistrationPage.txtbx_Address(driver).sendKeys("2345 Halls Rd");
    RegistrationPage.txtbx_City(driver).clear();
    RegistrationPage.txtbx_City(driver).sendKeys("Santa Monica");
    RegistrationPage.txtbx_State(driver).clear();
    RegistrationPage.txtbx_State(driver).sendKeys("CA");
    RegistrationPage.txtbx_ZipCode(driver).clear();
    RegistrationPage.txtbx_ZipCode(driver).sendKeys("90405");
    RegistrationPage.txtbx_Phone(driver).clear();
    RegistrationPage.txtbx_Phone(driver).sendKeys("3123754477");
    RegistrationPage.txtbx_Email(driver).clear();
    RegistrationPage.txtbx_Email(driver).sendKeys("sujankishore@gmail.com");
    RegistrationPage.btn_Next(driver).click();
    
    
    //Dealer Selection page 
    if(DealerSelectionPage.chkbx_Default(driver).isSelected()==true)
    DealerSelectionPage.chkbx_Default(driver).click();
    DealerSelectionPage.chkbx_NonDefault(driver).click();    
    String actualPrice=DealerSelectionPage.lbl_actualPrice(driver).getText();    
    System.out.println("actualPrice="+actualPrice);
    DealerSelectionPage.btn_Next(driver).click();

    //Certificate Page
    driver.switchTo().frame(CertificatePage.cntr_Certificate(driver));   
    String offerPrice=CertificatePage.lbl_OfferPrice(driver).getText();
    System.out.println("offerPrice="+offerPrice);

    //Assert that actualPrice in Dealer Selection Page is equal to the offerPrice in Certificate Page
    try {
        assertEquals(actualPrice,offerPrice);
   } catch (Error e) {
     verificationErrors.append(e.toString());
   } 
   
     
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
 
}
