package dummy;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//	import org.openqa.selenium.firefox.FirefoxDriver;

public class democlass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Testing\\JARS\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\Testing\\JARS\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\Testing\\JARS\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");

	}

}
 