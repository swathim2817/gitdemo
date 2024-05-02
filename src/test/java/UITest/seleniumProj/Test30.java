package UITest.seleniumProj;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name");
		String pr=sc.nextLine();
		sc.close();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pr);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(5000);
		List<WebElement>l=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		System.out.println(l.size());
		int vc=0;
		for(WebElement e:l) {
			if(e.isDisplayed()) {
				vc++;
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='2px red dotted';", e);

			}
		}
		System.out.println(vc);
		

	}

}
