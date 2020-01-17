package pack;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWatch {

	//Screenshot is taken by this call
	public static void takepicture(WebDriver driver,String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//Watchpicture//"+filename+".png"));
	}
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
		//To initilize the driver
		WebDriver driver=new ChromeDriver();		
		//To redirect to the amazon website based on the url
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		//To maximise the window
		driver.manage().window().maximize();
		//To find the search box in website based on its HTML id
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women watches");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
		//To find the fourth watch in the array of display array[3]
		driver.findElement(By.cssSelector("img[data-image-index=\"3\"]")).click();
		Thread.sleep(3000);
		//To switch tbs
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		takepicture(driver, "img1");
		Thread.sleep(3000);
		//to close the ctive tab of the window
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		driver.close();
	}
}