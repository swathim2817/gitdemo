package UITest.seleniumProj;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Get product type to search from keyboard
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter product type to search");
				String pro=sc.nextLine();
				sc.close();
				//open browser
				WebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://www.amazon.in");
				Thread.sleep(5000);
				//Search for a product
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pro);
				driver.findElement(By.xpath("//input[@value='Go']")).click();
				Thread.sleep(5000);
				//collect all results page by page
				int trc=0;
				while(true) //infinite loop for pagination
				{
					//Collect results in current page
					List<WebElement> l=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']")); 
					int prc=l.size();
					trc=trc+prc; //add to total results count
					//click on "Next" link to go to next page if exist
					try
					{
					  driver.findElement(By.linkText("Next")).click();
					  Thread.sleep(3000);
					}
					catch(Exception ex)
					{
					  break;  //terminate from loop when next link disabled or not available
					}
				}
				System.out.println("count of all results in all pages is "+trc);
				//close site
				//driver.close();

	}

}
