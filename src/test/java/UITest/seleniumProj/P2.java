package UITest.seleniumProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
//		String msg=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
//		System.out.println(msg);
//		String[] s=msg.split("'");
//		String password=s[1].split("'")[0];
		String s3=password(driver);
		System.out.println(s3);

	}
	
	public static String password(WebDriver driver)
	{
		String msg=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(msg);
		String[] s=msg.split("'");
		String password=s[1].split("'")[0];
		return password;
	}

}
