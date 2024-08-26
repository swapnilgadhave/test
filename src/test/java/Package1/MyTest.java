package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MyTest {
@Test
public void testCase1()
{
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.orangehrm.com/en/contact-sales/");

	WebElement dropdownElement = driver.findElement(By.id("Form_getForm_Country"));

	Select dropdownCountry = new Select(dropdownElement);

	String Expectedtext = "India";

	dropdownCountry.selectByValue(Expectedtext);

	String selectedCountry= dropdownCountry.getFirstSelectedOption().getText();

	System.out.println("Selected country name is  "+selectedCountry);

	Assert.assertEquals(selectedCountry, Expectedtext, "Countries do not match");

	}
}
