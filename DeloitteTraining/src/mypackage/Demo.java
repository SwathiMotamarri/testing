package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
		Demo demo=new Demo();
		demo.callWeb();
	}
	public void callWeb()
	{
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.linkedin.com/feed/?midToken=AQEsDFtpkKeUow");
	}
}
