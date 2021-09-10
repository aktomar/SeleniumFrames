package handleIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiyingIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		
		//Count number of frames available on webpage
		int total_frame= driver.findElements(By.tagName("iframe")).size();
		System.out.print("Toatl Frames avilable on WebPage : "+total_frame);
		
		
		
		//Accesing child frame
		
		driver.switchTo().frame("frame1").switchTo().frame(0); 
		
		WebElement text1 = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
		System.out.print("\n Available text on Frame: "+text1.getText());
		
		//Accessing parent frame.....
		
		driver.switchTo().parentFrame();
		WebElement text = driver.findElement(By.xpath("//*[text()='Parent frame']"));
		System.out.print("\n Available text on Frame: "+text.getText());
		

		
		
	
		Thread.sleep(5000);
		

		
		driver.quit();

		
	}

}
