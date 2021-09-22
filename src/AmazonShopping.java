import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonShopping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Select options=new Select(driver.findElement(By.id("searchDropdownBox")));
		options.selectByValue("search-alias=todays-deals");
		Thread.sleep(2000);
		String search="samsung zfold3";
		driver.findElement(By.name("field-keywords")).sendKeys(search);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"p_n_availability/1318485031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);
//		if (driver.findElement(By.xpath("//input[@checked='']")).isDisplayed())
//		{
//			System.out.println("Checkbox selected");
//		}
//		else {
//			System.out.println("Checkbox not selected!!!!!!!");
//		}
		String result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
		if (result.contains("fold3")) {
			System.out.println("Result contains fold3 - Pass");
		}
		else {
			System.out.println("Result is not valid - Fail");
		}
		String sitename=driver.getTitle();
		if(sitename.contains("fold3")){
			System.out.println("Title contains fold3 - Pass");
		}
		else {
			System.out.println("Title is not valid - Fail");
		}
		driver.close();
		System.out.println("End of Test");
	}

}
