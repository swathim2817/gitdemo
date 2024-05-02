package UITest.seleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year="2024";
		String month="5";
		String date="19";
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//input[contains(@class,'react-date-picker__inputGroup__input')]"));
		for(int i=0;i<l.size();i++)
		{
			
			System.out.println(l.get(i).getAttribute("value"));
		}

	}

}
