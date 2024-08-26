package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countLinkInputfields {

	public static void main(String[] args) {
		System.setProperty("chromedriver", "C:\\Users\\swapn\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List <WebElement> linkedlist  = driver.findElements(By.tagName("a"));
		int linkcount = linkedlist.size();
		System.out.println("count of links on facebook site " +linkcount);
		
		for (int i=0; i<linkedlist.size();i++)
		{
		//linkedlist.get(i).getText();
		System.out.println("Text of links on facebook site " +linkedlist.get(i).getText());
		}
		
		List <WebElement> listofinputs = driver.findElements(By.tagName("input"));
		int inputcount = listofinputs.size();
		System.out.println("count of inputs on facebook site " +inputcount);
		
	}

}
