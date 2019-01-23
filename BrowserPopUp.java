package browsepop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://html.com/input-type-file/");
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\SIVAPRASAD\\Desktop");
        //type =File must be there to browse,upload or attach a file button important
    }
}
