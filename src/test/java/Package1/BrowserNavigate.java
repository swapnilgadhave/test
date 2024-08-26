package Package1;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BrowserNavigate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		
		// taking screenshot with timestamp
		String timestamp = getTimestamp();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(".//Screenshots//test_screenshot"+timestamp+".png");
		FileUtils.copyFile(src,des);
		//driver.close();
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(1000));
		//WebElement tempTexbox= wait.until(ExpectedConditions.visibilityOf(textbox));
		
		//driver.window().getTitle();
	}
	private static String getTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HHmmss");
        return now.format(formatter);
    }

}
