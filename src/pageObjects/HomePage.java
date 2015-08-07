package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 
public class HomePage {
 
    private static WebElement element = null;
    
    
    public static WebElement dropdwnbx_Make(WebDriver driver){    	
        element = driver.findElement(By.xpath(".//*[@id='s2id_home_select_make']/a/span"));
        return element;
         }
         
 
     public static WebElement dropdwnbx_Model(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='s2id_home_select_model']/a/span"));
         return element;
         }
     
     public static WebElement txtbx_ZipCode(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='home_zip']"));
         return element;
         }
 
     public static WebElement btn_Go(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='home_cta']"));
         return element;
         }
     
     public static WebElement txtbx_Search(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='select2-drop']/div/input"));
         return element;
         }
     
     public static WebElement lnk_Make(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/div/span"));
         return element;
         }
     
     public static WebElement lnk_Model(WebDriver driver){
         element = driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li[1]/ul/li/div/span"));
         return element;
         }
     
 
}

