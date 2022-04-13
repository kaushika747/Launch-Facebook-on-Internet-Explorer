//KAUSHIKA NAIK
//KAUSHIKARV@GMAIL.COM
//08.04.2022

//Launching Facebook in Internet Explorer

package InternetExplorerBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestInternetExplorer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Downloads\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

}
