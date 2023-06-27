package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("Microsoft");
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("Reetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Antony");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rini");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample text in description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("antony.daliavm@gmail.com");
		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6364450148");
		WebElement clead = driver.findElement(By.name("submitButton"));
		clead.click();
		System.out.println("The title of the next page after creating lead is : "+driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Varsha");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title of the next page after duplicating lead is : "+driver.getTitle());
		driver.close();
		



		
		
		
		
	}

}
