import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assessment2BudgetCalculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		Thread.sleep(2000);
		String food="4000";
		String clothing="2000";
		String shelter="5000";
		String mthpay="10000";
		String mthother="3000";
		driver.findElement(By.id("food")).sendKeys(food);
		driver.findElement(By.id("clothing")).sendKeys(clothing);
		driver.findElement(By.id("shelter")).sendKeys(shelter);
		driver.findElement(By.id("monthlyPay")).sendKeys(mthpay);
		driver.findElement(By.id("monthlyOther")).sendKeys(mthother);
		Thread.sleep(2000);
		String mthIncome=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		String mthExpense=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Total Monthly Income is "+mthIncome);
		System.out.println("Total Monthly Expenses is "+mthExpense);
		if(Float.parseFloat(mthIncome)>Float.parseFloat(mthExpense)) {
			System.out.println("Income is Greater");
		}
		else {
			System.out.println("Expense is Greater");
		}
		driver.close();
		System.out.println("Test Ended");
	}
}