package UITest.seleniumProj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.w3schools.com/");
       Thread.sleep(5000);
       driver.findElement(By.linkText("Try it Yourself")).click();
       Thread.sleep(5000);
       Set<String>s=driver.getWindowHandles();
       System.out.println(s);
       
	}

}
