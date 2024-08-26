package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		
	}

}
