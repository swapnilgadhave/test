package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alertElement = driver.switchTo().alert();
		System.out.println("Alert message " +alertElement.getText());
		alertElement.sendKeys("Hi");
		alertElement.accept();
		
	}

}
