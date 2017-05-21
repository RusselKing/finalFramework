

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"./src/test/resources/com/stay/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.etsy.com");
		TakesScreenshot screenShot=(TakesScreenshot)driver;
		
		File picture = screenShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(picture, new File("D:/temp"));

	}

}
