package HomeAssignment.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsAccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//Navigating to Accounts tab
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Hasini Venkatasubramanian8");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester. Practicing by Hasini");
		driver.findElement(By.id("numberEmployees")).sendKeys("2");
		String Title2 =driver.getTitle();
		System.out.println(Title2);
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		Thread.sleep(3000);
		
		String Title3 =driver.getTitle();
		System.out.println(Title3);
		
		WebElement Accountname=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String AC=Accountname.getText();
		System.out.println(AC);
		
	}
	

}
