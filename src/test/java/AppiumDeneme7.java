import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Set;

public class AppiumDeneme7 {
    @Test
    public void test01() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.get("https://www.amazon.com.tr");
        Set<String> contextSet=driver.getContextHandles();

        for (String each:contextSet
             ) {
            if (each.equals("NATIVE_APP")){
                driver.context(each);
                break;
            }
        }

        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Giriş Yap ›\"]/android.widget.TextView")).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='Hoş Geldiniz']")).isDisplayed());


    }
}
