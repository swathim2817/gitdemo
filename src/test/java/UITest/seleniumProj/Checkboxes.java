package UITest.seleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		int dle=0,ele=0,ndle=0,dele=0,sele=0,dsele=0;
		
				
		List<WebElement> ele1= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele2:ele1)
		{
			if(ele2.isDisplayed())
			{
				dle++;
				if(ele2.isEnabled())
				{
					ele++;
					
					if(ele2.isSelected())
					{
						sele++;
						
					}
					else
					{
						dsele++;
					}
					
					
				}
				
				else {
					dele++;
				}
				
			}
			else
			{
				ndle++;
			}
			
		}
		
		System.out.println("is displayed "+dele);
		System.out.println("is enabled "+ele);
		System.out.println("is selected "+sele);
		System.out.println("is dselected "+dsele);
		System.out.println("is disabled"+dele);
		System.out.println("is notdisplayed "+ndle);
		System.out.println(dle);

	}

	private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
