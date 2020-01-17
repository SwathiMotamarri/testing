package pac;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver2)
	{
		driver=driver2;
	}
	
	public static void takepicture(WebDriver driver,String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//screenshotslogin//"+filename+".png"));
	}
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		takepicture(driver, "img1");
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}	
	
	//targets
	private By username=By.id("username");
	private By password=By.id("password");
	private By signinbtn=By.className("btn__primary--large from__button--floating");
	//Actions
	public void setUsername() 
	{
		driver.findElement(username).sendKeys("SwathiMotamarri");
	}
	
		
	public void setPassword() 
	{
		driver.findElement(password).sendKeys("mercury");
	}

	public void clickOnSignin()
	{
	}
	
	//Login Action
		public void login()
		{
			this.setUsername();
			this.setPassword();
			this.clickOnSignin();
			
		}
	
}
