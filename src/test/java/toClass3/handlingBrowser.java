package toClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class handlingBrowser extends BaseDriver {

	String url = "http://aims.baf.org/";

	// Opening browser and navigating to url, maximizing browser view
	@Test
	public void browser() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();

		// login with Service number aka ID
		WebElement serviceNum = driver.findElement(By.id("service_number"));
		serviceNum.click(); // clicks on link with given ID
		serviceNum.sendKeys("Support17104"); // to sent value

		// Clicking on Log in Button
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		loginButton.click(); // Click the login button
		Thread.sleep(5000);

//      navigating the on the logout button. 
		driver.findElement(By.xpath("//body/div[1]/div[3]/ul[2]/li[6]/a[1]/i[1]")).click();
//  	Clicking the logout button. Needed this extra step as clicking logout btn opens 2 sub menu: 
//		1. profile and 2. Logout
		driver.findElement(By.xpath("//body/div[1]/div[3]/ul[2]/li[6]/div[1]/form[1]/a[1]")).click();
		Thread.sleep(10000);
	}
}
