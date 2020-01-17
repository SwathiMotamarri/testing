package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitex {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Kalpana\\TEST\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
    driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
    WebDriverWait wait=new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='QTP']")));
  String text=  driver.findElement(By.xpath("//p[text()='QTP']")).getText();
  System.out.println(text);
  driver.close();
  
}
}
