package pageObjects;
import org.openqa.selenium.*;


 
public class DealerSelectionPage {
 
    private static WebElement element = null;
    
    
    public static WebElement chkbx_Default(WebDriver driver){    	
        element = driver.findElement(By.id("dealers-0"));
        return element;
         }
         
    
    public static WebElement chkbx_NonDefault(WebDriver driver){    	
        element = driver.findElement(By.id("dealers-1"));
        return element;
         }
    
    public static WebElement lbl_actualPrice(WebDriver driver){    	
        element = driver.findElement(By.xpath("//div[@id='config_col2']/div[2]/ul[2]/li[2]/span[3]"));
        return element;
         }
    
    public static WebElement btn_Next(WebDriver driver){    	
        element = driver.findElement(By.cssSelector(".button.b10.get-cert"));
        return element;
         }
    
    
}

