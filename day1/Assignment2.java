package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[contains(@id,'group')]")).sendKeys("Local");
		driver.findElement(By.xpath("//input[contains(@id,'office')]")).sendKeys("Site");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("2600000");
		
		WebElement ind = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(ind);
		industry.selectByValue("IND_SOFTWARE");
		
		WebElement ship = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ship);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement src = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(src);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mrk = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select(mrk);
		marketing.selectByIndex(5);
		
		WebElement st = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(st);
		state.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[contains(@onclick,'submit')]")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
