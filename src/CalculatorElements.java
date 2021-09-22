import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class CalculatorElements {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\00002803\\eclipse\\chrome_driver\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		Thread.sleep(2000);
		driver.findElement(By.id("homeval")).sendKeys("300");
		driver.findElement(By.id("downpayment")).sendKeys("50");
		driver.findElement(By.xpath("//input[@value='percent']")).click();
		if(driver.findElement(By.xpath("//input[@value='percent']")).isSelected())
		{
			System.out.println("PASS : Radio Button Selected");
		}
		else
		{
			System.out.println("FAIL : Radio Button Not Selected");
		}
		Select monthSelect=new Select(driver.findElement(By.name("param[start_month]")));
		monthSelect.selectByValue("12");
		Thread.sleep(5000);
		monthSelect.selectByIndex(4);
		Thread.sleep(5000);
		monthSelect.selectByVisibleText("Jul");
		Thread.sleep(5000);
		//driver.findElement(By.name("cal")).click();
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		Thread.sleep(2000);
		String value=driver.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
		System.out.println("Total Monthly Payment is "+value);
		
		Thread.sleep(2000);
		driver.close();
	}
}
