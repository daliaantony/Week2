package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']//a")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-tc']//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_companyName']")).sendKeys("Audi");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_firstName']")).sendKeys("Nora");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_lastName']")).sendKeys("Antony");
		WebElement src = driver.findElement(By.xpath("//span[@class='requiredField']/following::select[@id='createLeadForm_dataSourceId']"));
		Select source=new Select(src);
		source.selectByVisibleText("Employee");
		
		WebElement mrk = driver.findElement(By.xpath("//span[@class='tableheadtext']/following::select[@id='createLeadForm_marketingCampaignId']"));
		Select marketing = new Select(mrk);
		marketing.selectByValue("9001");
		
		WebElement own = driver.findElement(By.xpath("//span[@class='tableheadtext']/following::select[@id='createLeadForm_ownershipEnumId']"));
		Select owner = new Select(own);
		owner.selectByIndex(5);
		
		WebElement ctry = driver.findElement(By.xpath("//span[@class='tableheadtext']/following::select[@id='createLeadForm_generalCountryGeoId']"));
		Select country = new Select(ctry);
		country.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//td[@colspan='4']//input[@name='submitButton']")).click();
		System.out.println("The title of the resulting page is : "+driver.getTitle());
		
		
		driver.close();
	}

}
