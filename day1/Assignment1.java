package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nora");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Antony");
		driver.findElement(By.xpath("//input[contains(@name,'reg')][1]")).sendKeys("9987876544");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("password");
		
		WebElement day = driver.findElement(By.id("day"));
		Select dob=new Select(day);
		dob.selectByIndex(7);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dob1=new Select(month);
		dob1.selectByValue("7");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dob2=new Select(year);
		dob2.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		driver.close();
		
		
		
		
		
		
		

	}

}
