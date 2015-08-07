package pageObjects;
import org.openqa.selenium.*;



public class RegistrationPage {
 
    private static WebElement element = null;
    
    
    public static WebElement txtbx_FirstName(WebDriver driver){    	
        element = driver.findElement(By.id("given_name"));
        return element;
         }
    
    public static WebElement txtbx_LastName(WebDriver driver){    	
        element = driver.findElement(By.id("family_name"));
        return element;
         }
    
    public static WebElement txtbx_Address(WebDriver driver){    	
        element = driver.findElement(By.id("street_address"));
        return element;
         }
    
    public static WebElement txtbx_City(WebDriver driver){    	
        element = driver.findElement(By.id("city"));
        return element;
         }

    public static WebElement txtbx_State(WebDriver driver){    	
        element = driver.findElement(By.id("state"));
        return element;
         }
    
    public static WebElement txtbx_ZipCode(WebDriver driver){    	
        element = driver.findElement(By.id("postal_code"));
        return element;
         }
    
    public static WebElement txtbx_Phone(WebDriver driver){    	
        element = driver.findElement(By.id("phone_number"));
        return element;
         }
    
    public static WebElement txtbx_Email(WebDriver driver){    	
        element = driver.findElement(By.id("email_address"));
        return element;
         }
    
    public static WebElement btn_Next(WebDriver driver){    	
        element = driver.findElement(By.xpath("//div[@id='contact_fields']/button"));
        return element;
         }

 
}

