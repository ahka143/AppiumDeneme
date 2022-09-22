import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDeneme4 {

    @Test
    public void   test01 () throws Exception {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Emulator");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahka1\\IdeaProjects\\Appium\\Gesture Tool_v1.3_apkpure.com.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);

        driver.findElement(By.id("addButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("gesture_name")).sendKeys("Deneme");
        Thread.sleep(2000);
        driver.findElement(By.id("com.davemac327.gesture.tool:id/gestures_overlay")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("done")).click();
        Thread.sleep(2000);
       String expectedText="Deneme";
       String actualText=driver.findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
       Assert.assertEquals(actualText,expectedText);


    }
}
