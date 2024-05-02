package UITest.seleniumProj;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement ele=driver.findElement(By.id("gf-BIG"));
		System.out.println(ele.findElements(By.tagName("a")).size());
		WebElement ele1=ele.findElement(By.xpath(" //table/tbody/tr/td/ul"));
		System.out.println(ele1.findElements(By.tagName("a")).size());
		for(int i=1;i<ele1.findElements(By.tagName("a")).size();i++)
		{
			String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ele1.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			
		}
		Set<String> winodws=driver.getWindowHandles();
		Iterator<String> a=winodws.iterator();
		while(a.hasNext())
		{
			driver.switchTo().window(a.next());
			System.out.println(driver.getTitle());
			
		}

	}

}
