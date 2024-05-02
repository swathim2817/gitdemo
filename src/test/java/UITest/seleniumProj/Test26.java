package UITest.seleniumProj;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open browser
				WebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://www.google.com");
				Thread.sleep(5000);
				//collect elements
				List<WebElement> l=driver.findElements(By.xpath("//*")); //no element matched
				//System.out.println(l.size()); //0
				
				List<WebElement> l2=new ArrayList<WebElement>();
				for(WebElement e:l) {
					if(e.getAttribute("href")!=null)
					{
						l2.add(e);
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].style.border='2px red dotted';",e);
						
					}
					
				}
				
				System.out.println(l.size());
				System.out.println(l2.size());
				//close site
//				driver.close();

		

	}

}
