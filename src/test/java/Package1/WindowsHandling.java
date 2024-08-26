package Package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		WebElement ORM_APILink = driver.findElement(By.xpath("//a[@href='https://api.orangehrm.com/']"));
		WebElement OrangeHRMLink = driver.findElement(By.xpath("//a[normalize-space(text())=\"OrangeHRM\"]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ORM_APILink).perform();
		actions.moveToElement(OrangeHRMLink).perform();
		ORM_APILink.click();
		OrangeHRMLink.click();
		
		//Handle multiple windows
		Set<String> WindowsIDs = driver.getWindowHandles(); //using getwindowsHandles()
		Iterator<String> IT = WindowsIDs.iterator(); //Iterator to store the winodws ID's
		String ParentwindowsID = IT.next(); //next windows id's
		String ChildWindowsID = IT.next();
		System.out.println("Parent window:" +ParentwindowsID);
		System.out.println("Parent window:" +ChildWindowsID);
		
		//Switching windows ID
		driver.switchTo().window(ChildWindowsID);
		System.out.println("Child window elements:" +driver.getTitle());
		
		driver.switchTo().window(ParentwindowsID);
		System.out.println("Parent window elements:" +driver.getTitle());
		
		/*for(int i=0;i<20;i++)
		{
			actions.sendKeys(Keys.PAGE_DOWN).perform();
		}	*/
		
		//Webelements of the new tabs opened
		//WebElement ORM_Page_text = driver.findElement(By.xpath("//h2[text()='See What Our Customers Have to Say']"));
		//WebElement API_Page_text = driver.findElement(By.xpath("//h1[text()='OrangeHRM REST API Documentation']"));
		//actions.moveToElement(ORM_Page_text).perform();
		//System.out.println(ORM_Page_text.getText());
	}

}
