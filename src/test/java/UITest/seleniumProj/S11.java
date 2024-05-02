package UITest.seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//book-app[@apptitle=\"BOOKS\"]"))
		.getShadowRoot()
		.findElement(By.id("input")).sendKeys("PNR sir");

	}

}
