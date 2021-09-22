import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		int numFrame=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames is "+numFrame);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElement(By.id("draggable")).getText());
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions dragdrop=new Actions(driver);
		dragdrop.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		String title=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Title is "+title);
		driver.close();		
	}

}
