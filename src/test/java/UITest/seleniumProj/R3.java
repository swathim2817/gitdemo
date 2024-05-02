package UITest.seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(ele);
		s.selectByVisibleText("INR");
		System.out.println(s.getFirstSelectedOption().getText());
		

	}

}
