import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsButtonLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		int numButton=driver.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("Number of buttons are "+numButton);
		
		for (int i=0;i<numButton;i++) {
			System.out.println(driver.findElements(By.xpath("//input[@type='submit']")).get(i).getAttribute("value"));
		}
		
		int numLinks=driver.findElements(By.tagName("a")).size();
		System.out.println("Number of Links are "+numLinks);
		
		for (int i=0;i<numLinks;i++) {
			System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
		}
		driver.close();

	}

}
