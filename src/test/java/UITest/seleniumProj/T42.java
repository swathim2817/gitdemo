package UITest.seleniumProj;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T42 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter match url in Cricbuzz");
		String u=sc.nextLine();
		System.out.println("Enter innings number  like 1 or 2");
		int i=sc.nextInt();
		System.out.println("Enter bats man position");
		int p=sc.nextInt();
		if(p>11 || i>2)
		{
			System.out.println("Given details are invalid in cricket");
			System.exit(0); //stop execution forcibly
		}
		sc.close();
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get(u); 
		Thread.sleep(5000);
		//get runs of bats man in given position
		try
		{
			String temp=driver.findElement(By.xpath(
			"(//div[@id='innings_"+i+"']//div[contains(@class,'cb-col-25')]/a)["+p+"]/following::div[2]"))
			.getText();
			int runs=Integer.parseInt(temp); //type conversion
			System.out.println(runs);
		}
		catch(Exception ex)
		{
			if(p==1) 
			{
				System.out.println(p+"st position player did not bat");
			}
			else if(p==2)
			{
				System.out.println(p+"nd position player did not bat");
			}
			else if(p==3)
			{
				System.out.println(p+"rd position player did not bat");
			}
			else
			{
				System.out.println(p+"th position player did not bat");
			}
			
		}


	}

}
