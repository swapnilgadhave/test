package Package1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Package1.Utilities;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");
		
		WebElement oneelement = driver.findElement(By.xpath("//button[@name='cs_one']"));
		WebElement twoelement = driver.findElement(By.xpath("//button[@name='cs_two']"));
		WebElement textbox = driver.findElement(By.xpath("//input[@name='cs_display']"));
		System.out.println(" First number "+oneelement.getText());
		
		String secondnumber = twoelement.getText();
		int S2 = Integer.parseInt(secondnumber);
		System.out.println("Second Number" +S2);
		
       //Explict Wait
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(1));
		WebElement tempTexbox= wait.until(ExpectedConditions.visibilityOf(textbox));
		tempTexbox.sendKeys("99999"+secondnumber);
		//oneelement.click();
		//twoelement.click();
	    //textbox.sendKeys(String.valueOf(S2));
		//System.out.println(" number " +textbox.getAttribute());
		
		//driver.quit();
		// Capture the screenshot and store it in a file object
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        // Specify the location to save the screenshot
        File destFile = new File(System.getProperty("user.dir") +"/Screenshots/screenshot.png");

        try {
            // Copy the screenshot to the specified location
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
	}
	}
}
