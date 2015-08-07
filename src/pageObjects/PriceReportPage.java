package pageObjects;
import org.openqa.selenium.*;

 
public class PriceReportPage {
 
    private static WebElement element = null;
    
    
    public static WebElement dropdwnbx_Style(WebDriver driver){    	
        element = driver.findElement(By.xpath(".//*[@id='s2id_select_style']/a/span"));
        return element;
         }
         
 
     public static WebElement dropdwnbx_Model(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='s2id_home_select_model']/a/span"));
         return element;
         }
     
     public static WebElement chkbx_Options(WebDriver driver){
         element = driver.findElement(By.id("tc_option_11"));
         return element;
         }
     
     public static WebElement chkbx_Incentives(WebDriver driver){
         element = driver.findElement(By.id("incentive_4000113422"));
         return element;
         }
 
     public static WebElement btn_EditOptions(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='edit_opts']/button"));
         return element;
         }
     
     public static WebElement btn_EditIncentives(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='edit_incs']/button"));
         return element;
         }
     
     
     public static WebElement btn_SaveAndUpdate(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='oo-container']/div[3]/span[2]"));
         return element;
         }
     
     
     public static WebElement btn_Next(WebDriver driver){
         element = driver.findElement(By.cssSelector(".button.b10.reg_cta.reg-action"));
         return element;
         }
     

     public static WebElement txtbx_Search(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='select2-drop']/div/input"));
         return element;
         }
     
     public static WebElement lnk_Style(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/div"));
         return element;
         }
     
 
}

