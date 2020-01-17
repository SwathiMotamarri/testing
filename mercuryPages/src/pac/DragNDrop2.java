package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Kalpana\\TEST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	   WebElement rome= driver.findElement(By.xpath("//*[@id='box6']"));
	   WebElement italy= driver.findElement(By.xpath("//*[@id='box106']"));
       Actions action=new Actions(driver);
       action.dragAndDrop(rome, italy).build().perform();
	}

}
