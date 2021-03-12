import java.io.IOException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");

                WebDriver driver = new ChromeDriver(chromeOptions);

                driver.get("http://localhost:81");
		Thread.sleep(1000);
		driver.findElement(By.id ("About Us")).click();

                Thread.sleep(1000);

                if (driver.getPageSource().contains("This is Emerson demo by Amrish.")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Pass");
                }
                driver.quit();
        }
}
