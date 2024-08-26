package Package1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testxpath 
{

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/s?k=mobiles&crid=1THHMZSPNR1CO&sprefix=mobiles%2Caps%2C190&ref=nb_sb_noss_1");
driver.manage().window().maximize();

//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
//WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(checkbox1));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

WebElement checkbox1 = driver.findElement(By.xpath("//li[@id ='p_90/6741118031']//input[@type='checkbox']"));

//wait.until(ExpectedConditions.visibilityOfElement());

if (!checkbox1.isSelected()) {
    // Click to check the checkbox
    checkbox1.click();
}

	}

}
