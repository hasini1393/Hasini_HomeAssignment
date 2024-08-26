package HomeAssignment.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Hasu");
		
		WebElement LastName= driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Venkat");
		
		WebElement MobileNumber= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MobileNumber.sendKeys("7708218969");
		
		WebElement NewPassword= driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		NewPassword.sendKeys("India@123");
		
		WebElement Birthday =driver.findElement(By.name("birthday_day"));
		
		Select Day=new Select(Birthday);
		Day.selectByVisibleText("13");
		
		WebElement BirthMonth =driver.findElement(By.name("birthday_month"));
		
		Select BMonth=new Select(BirthMonth);
		BMonth.selectByVisibleText("Sep");
		
		WebElement BirthYear =driver.findElement(By.name("birthday_year"));
		
		Select BYear=new Select(BirthYear);
		BYear.selectByValue("1993");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name='sex' and @value='-1']")).click();
		
		driver.close();
		
		
	}

}
