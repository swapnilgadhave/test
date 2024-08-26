package Package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class foreach_windowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		WebElement ORM_APILink = driver.findElement(By.xpath("//a[@href='https://api.orangehrm.com/']"));
		WebElement OrangeHRMLink = driver.findElement(By.xpath("//a[normalize-space(text())=\"OrangeHRM\"]"));
		
		//Scroll page
		Actions actions = new Actions(driver);
		actions.moveToElement(ORM_APILink).perform();
		actions.moveToElement(OrangeHRMLink).perform();
		//click links
		ORM_APILink.click();
		OrangeHRMLink.click();
		
		//use Set to store the multiple windows with windowshandles
		Set<String> WindowsID = driver.getWindowHandles();
		List <String> WindowsList = new ArrayList(WindowsID);
		
		//Iterator <String> IT = WindowsID.iterator();
		for (String Winid:WindowsList)
		{
			System.out.println(Winid);
			String wintext = driver.switchTo().window(Winid).getTitle();
			System.out.println("Winodw" + wintext);
			if(wintext.equals("Get to Know Us | Innovating HR Solutions | OrangeHRM")|| wintext.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}	
		}
	}

}
