package UITest.seleniumProj;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAlternateFound {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		List<String> l1=new ArrayList<String>();
		List<WebElement> l=driver.findElements(By.tagName("a"));
		for(WebElement ele:l)
		{
			l1.add(ele.getAttribute("innerHTML"));
			
		}
		System.out.println(l1);
		

	}

}
