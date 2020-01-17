package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Kalpana/TEST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		WebElement box=driver.findElement(By.id("gh-cat"));
		Select select=new Select(box);
		select.selectByIndex(4);
		Thread.sleep(3000);
		select.selectByValue("15032");
		Thread.sleep(3000);
		select.selectByVisibleText("Business & Industrial");
	}

}
