package UITest.seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		int i=1;
		while(i<5)
			{
			Thread.sleep(2000);
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			}
	
		
		

	}

}
