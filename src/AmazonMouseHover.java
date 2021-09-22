import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Actions hover= new Actions(driver);
		hover.moveToElement(driver.findElement(By.partialLinkText("Account & Lists"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
