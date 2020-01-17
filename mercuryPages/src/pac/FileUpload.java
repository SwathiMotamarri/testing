package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {
public static void main(String[] args) throws FindFailed {
	System.setProperty("webdriver.chrome.driver", "G:\\Kalpana\\TEST\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///H:/Selenium%20content/sqlfile.html");
	driver.findElement(By.xpath("/html/body/input")).click();
	Screen screen=new Screen();
	Pattern p1=new Pattern("C:\\Users\\Hp\\OneDrive\\Desktop\\img1.PNG");
	Pattern p2=new Pattern("C:\\Users\\Hp\\OneDrive\\Desktop\\img2.PNG");
	screen.click(p1);
	screen.click(p2);

	
}
}
