package UITest.seleniumProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.findElement(By.linkText("Try it Yourself")).click();
        Thread.sleep(5000);
        Set<String>windows=driver.getWindowHandles();
        System.out.println(windows);
        List<String>l=new ArrayList<String>(windows);
        driver.switchTo().window(l.get(1));
        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(l.get(0));
        driver.close();
        
	}

}
