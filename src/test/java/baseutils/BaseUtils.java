package baseutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseUtils {
	public static WebDriver driver;
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Amol\\930LiveProject\\src\\test\\java\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
public void launch()
{
	driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
public void login()
{
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("master");
	
	driver.findElement(By.id("btnsubmit")).click();
	String actres=driver.findElement(By.id("ewPageCaption")).getText();
	Assert.assertTrue(actres.contains("Dashboard"));
	
	/*if(actres.equals("Dashboard"))
	{
		System.out.println("Login Success test case pass");
	}else
	{
		System.out.println("Login fail test case fail");
	}*/

}
public void cloaseapp()
{
driver.close();	
}


}
