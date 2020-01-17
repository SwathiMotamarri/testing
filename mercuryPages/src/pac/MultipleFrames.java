package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Kalpana\\TEST/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/Hp/OneDrive/Desktop/desktopfiles02oct2019/frames.html");
	   
	   WebElement frame1= driver.findElement(By.xpath("/html/frameset/frame[1]"));
	    driver.switchTo().frame(frame1);
	    driver.findElement(By.id("001")).sendKeys("Frame1");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    
	    
	    WebElement frame2= driver.findElement(By.xpath("/html/frameset/frame[2]"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.id("002")).sendKeys("Frame2");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();

	    
	    
	    WebElement frame3= driver.findElement(By.xpath("/html/frameset/frame[3]"));
	    driver.switchTo().frame(frame3);
	    driver.findElement(By.id("003")).sendKeys("Frame3");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();

	}

}
