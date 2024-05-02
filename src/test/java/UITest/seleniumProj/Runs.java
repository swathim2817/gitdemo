package UITest.seleniumProj;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Take bats man number
				Scanner sc=new Scanner(System.in);
				System.out.println("enter url");
				String u=sc.nextLine();
				System.out.println("enter innings no+");
				int i=sc.nextInt();
				System.out.println("Position no");
				int p=sc.nextInt();
				if(p>11||i>2)
				{
					System.out.println("Invalid details");
					System.exit(0);
				}
				sc.close();
				WebDriver driver=new ChromeDriver();
				driver.get(u);
				Thread.sleep(4000);
				try
				{
					String temp=driver.findElement(By.xpath(
							"(//div[@id='innings_"+i+"']//div[contains(@class,'cb-col-25')]/a)["+p+"]/following::div[2]"))
							.getText();
							int runs=Integer.parseInt(temp); //type conversion
							System.out.println(runs);
				}
				catch(Exception e) {
					
				}
				
				
				


	}

}
