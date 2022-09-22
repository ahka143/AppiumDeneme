import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDeneme3 {

    @Test
    public void test01() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emlator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\ahka1\\IdeaProjects\\Appium\\Gesture Tool_v1.3_apkpure.com.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       // driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton")).click();
       // driver.findElement(By.xpath("(//android.widget.Button)[1]")).click();
        //driver.findElement(By.id("addButton")).click();
        driver.findElement(By.id("testButton")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("android:id/title")).getText());
      Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
      driver.quit();
    }
}
