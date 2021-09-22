import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		Thread.sleep(2000);
		System.out.println("Parent Window is "+driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		System.out.println("Parent Window ID is "+parent);
        		
		driver.switchTo().window(child);
		
		System.out.println("Child Window is "+driver.getTitle());
		System.out.println("Child Window ID is "+child);
		Thread.sleep(2000);
        driver.quit();
	}
}