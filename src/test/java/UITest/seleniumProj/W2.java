package UITest.seleniumProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		s=driver.getWindowHandles();
		l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(2));
		driver.get("https://login.yahoo.com/");
		
		

	}

}
