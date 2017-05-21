import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./src/test/resources/com/stay/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://www.hotwire.com/car-rentals/?gccid=-1");
		
		WebElement findCar = driver.findElement(By.xpath("//button[.='Find a car']"));
		
		Wait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.visibilityOf(findCar));

	}

}
