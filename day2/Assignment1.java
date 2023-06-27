package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

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
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//td[@tabindex='0']//a")).click();
		System.out.println("The page title after clicking the first entry is : "+driver.getTitle());
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).clear();
		String company="Gucci";
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys(company);
		driver.findElement(By.xpath("//td[@colspan='4']/input")).click();
		
		WebElement updated = driver.findElement(By.xpath("//span[@class='requiredField']/following::span"));
		
		String newcompany = updated.getText();
		String[] split=newcompany.split(" ");
	
		if(company.equals(split[0])){
			System.out.println("The input given as "+company+" matches with the value on the screen : "+newcompany);		
		}else {
			System.out.println("The new company name did not get updated");
		}
		driver.close();
	}

}
