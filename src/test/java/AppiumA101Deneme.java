import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumA101Deneme {

    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
      //  capabilities.setCapability("autoDismissAlerts", true);
       // capabilities.setCapability("disable-popup-blocking", false);
        capabilities.setCapability("chromedriverExecutable","C:\\Users\\ahka1\\IdeaProjects\\Appium\\driver\\chromedriver.exe");
        AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.get("https://www.a101.com.tr");
        driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
        driver.findElement(By.xpath("//a[@class='menu-toggle js-navigation-toggle visible-xs']")).click();




    }
}
