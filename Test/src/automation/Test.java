package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\IDM\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("select2-search")).sendKeys("akashdasdabu1994@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.className("text-center tours ")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("select2-input")).click();
		driver.findElement(By.className("select2-results")).sendKeys("Legoland Malaysia Day Pass");
		Thread.sleep(2000);
		
		driver.findElement(By.className("chosen-single")).click();
		driver.findElement(By.className("chosen-drop")).sendKeys("Yacht");
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("DateTours form-control form-readonly-control text-center")).click();
		driver.findElement(By.className("DateTours form-control form-readonly-control text-center")).clear();
		driver.findElement(By.className("DateTours form-control form-readonly-control text-center")).sendKeys("09/07/2021");
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn btn-whitebootstrap-touchspin-up")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn btn-primary btn-block")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn btn-secondary btn-block mt-20 btn-action btn-lg loader")).click();
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		String et = "phptravels";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Sucessful");
		}
		else
		{
			System.out.println("Test Failure");
		}

	}

}
