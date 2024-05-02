package UITest.seleniumProj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
