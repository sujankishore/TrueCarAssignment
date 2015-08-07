package pageObjects;
import org.openqa.selenium.*;


public class CertificatePage {
 
    private static WebElement element = null;
    
    
    public static WebElement cntr_Certificate(WebDriver driver){    	
        element = driver.findElement(By.xpath("//iframe[@id='ucr_container']"));
        return element;
         }
         
    
    public static WebElement lbl_OfferPrice(WebDriver driver){    	
        element = driver.findElement(By.cssSelector(".offer-pricing-price>p"));
        return element;
         }
        
    
}

