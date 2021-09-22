import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearchXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		String search="testing";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		String result=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
		if (search.equals(result)) {
			System.out.println("Same value - PASS");
		}
		else {
			System.out.println("Wrong value!!!!!!!! - FAIL");
		}
		Thread.sleep(2000);
		driver.close();
	}
}