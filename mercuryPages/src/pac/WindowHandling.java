
package pac;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Kalpana/TEST\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childwindows=driver.getWindowHandles();
		System.out.println(childwindows);
		
		for (String win : childwindows) {
			if(!parent.equals(win))
			{
				driver.switchTo().window(win);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.close();
			}
			
			
		}
		
		{
			driver.switchTo().window(parent);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		
		
	}

}
