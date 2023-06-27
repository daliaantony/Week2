package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleforceLoginXPath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[contains(@id,'p')]")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
