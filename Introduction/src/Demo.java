import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Driver object for Chrome Browser
		//We will strictly implement methods of webdriver
		
		//ChromeDriver driver=new ChromeDriver();
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adrcr\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		
		
		
	}

}
