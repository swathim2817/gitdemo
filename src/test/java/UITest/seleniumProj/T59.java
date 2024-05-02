package UITest.seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
//		WebElement e=driver.findElement(By.xpath("//div[@id='iframe']/descendant::iframe"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("swathi");

	}

}
