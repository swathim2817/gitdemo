package UITest.seleniumProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("http://www.w3shools.com");
      Thread.sleep(4000);
      driver.navigate().to("http://www.facebook.com");
      Thread.sleep(5000);
      driver.navigate().back();
      Thread.sleep(5000);
      driver.navigate().forward();
      Thread.sleep(5000);
      driver.navigate().refresh();
      
	}

}
