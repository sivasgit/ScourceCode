package browsepop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        //String text = alert.getText();
        if (alert.getText().equalsIgnoreCase("please enter a valid user name")) {
            System.out.println("Correct Alert Messeage");
        } else {
            System.out.println("Wrong Alert Messege");
        }
        alert.accept();//ie click on ok button
        //alert.dismiss();// click on cancel button
    }


}
