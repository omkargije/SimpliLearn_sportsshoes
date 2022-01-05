package SimpliLearn.sportsshoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class driverLaunch {
	@Test
	public void testcase_Driverclass() throws InterruptedException {
		String DriverPath = System.getProperty("user.dir");
		DriverPath = DriverPath+"\\src\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.medicare.gov");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='prefix-overlay-header']/button")).click();
		driver.findElement(By.xpath("//div[@id='bam-coachmark']/button")).click();
		
	}

}
