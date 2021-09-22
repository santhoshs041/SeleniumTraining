import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00002803\\eclipse\\chrome_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\00002803\\eclipse\\firefox_driver\\geckodriver.exe");
	//	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String sitename=driver.getTitle();
		System.out.println("Site Name is "+sitename);
		Thread.sleep(5000);
		driver.close();
	}
}