package SimpliLearn.sportsshoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverLaunch {

	public static void main(String[] args) {
		String DriverPath = "F:\\Selenium\\sportsshoes\\src\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.medicare.gov");
	}

}
