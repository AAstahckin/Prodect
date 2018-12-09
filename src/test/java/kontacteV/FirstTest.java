package kontacteV;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {


     @Test
     public void firstTest() {
          System.setProperty("webdriver.chrome.driver", "C:/Users/AAstashkin/Dawnloads/chromedriver.exe");
          ChromeDriver driver = new ChromeDriver();

          driver.get("https://vk.com/feed");




     }

}