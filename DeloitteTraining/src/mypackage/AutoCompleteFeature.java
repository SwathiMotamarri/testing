package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFeature 
{
	public static void main (String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
		AutoCompleteFeature autocf=new AutoCompleteFeature();
		autocf.callWeb();
	}
	
	public void callWeb() throws Exception
	{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amul Butter");
		Thread.sleep(3000);
		for (int i=1;i<=3;i++)
			{
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
			}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
}
