import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\00002803\\eclipse\\chrome_driver\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("session_password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		Thread.sleep(2000);
		String msg=driver.findElement(By.xpath("//*[@id=\"error-for-username\"]")).getText();
		System.out.println("Error is: "+msg);
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.close();
	}

}
