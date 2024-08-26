package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Dropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		WebElement dropdownElement = driver.findElement(By.id("Form_getForm_Country"));
		
		Select dropdowncountry = new Select(dropdownElement);
		//dropdowncountry.selectByVisibleText("Albania");
		
		//dropdowncountry.selectByValue(4);
		//dropdowncountry.selectByIndex(1);
		
		String Expectedtext = "Albania";
		
		String actualtext=dropdownElement.getText();
		
		System.out.println("Expectedtex"+actualtext);
		Assert.assertEquals(actualtext,Expectedtext,"text is matched");
	}

}
