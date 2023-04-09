package MainPackage.SeleniumChromeDriver.locators.basiclocatortype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName {//LOCATOR TAG NAME
    public static  WebElement we;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd =new ChromeDriver();
        wd.get("https://in.search.yahoo.com/?fr2=inr");
        we=wd.findElement(By.tagName("input"));
        we.sendKeys("Sumit");
        we.click();




        wd.close();
    }
}
