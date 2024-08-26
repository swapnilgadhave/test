package Package1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	//Explicit wait
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement WT = wait.until(ExpectedConditions.visibilityof(element));
}


