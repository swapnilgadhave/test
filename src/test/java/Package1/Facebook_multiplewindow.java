package Package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_multiplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//For scrolling page down
		Actions actions = new Actions(driver);
		for (int i=0; i<20 ; i++)
		{
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
        //actions.moveToElement(scrollElement).perform();// particulat element 
		
		WebElement SignUpLink = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));///a[text()='Sign Up']
		WebElement InstagramLink = driver.findElement(By.xpath("//a[text()='Instagram']"));
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/reg/");*/
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		
		//System.out.println("" +scrollElement.getText());
		//actions.contextClick(SignUpLink).build().perform();//Right click on the signup link
		Set<String> windowHandles = driver.getWindowHandles();
		String[] handles = windowHandles.toArray(new String[0]);
		driver.switchTo().window(handles[1]);
	}

}
