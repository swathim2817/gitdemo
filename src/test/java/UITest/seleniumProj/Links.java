package UITest.seleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pen drive");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		List<WebElement>l=driver.findElements(By.xpath("//img"));
		int vc=0;
		int hc=0;
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				vc++;
				System.out.println(vc+""+e.getAttribute("src"));
			}
			else
			{
				hc++;
		}
		}
		System.out.println(vc);
		System.out.println(hc);

	}

}
