import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDeneme2 {


    @Test
    public void test01() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
      //desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahka1\\Downloads\\Calc Smart Calculator_v2.2.4_apkpure.com.apk");
      desiredCapabilities.setCapability("appPackage","mobi.appplus.calculator.plus");
      desiredCapabilities.setCapability("appActivity","appplus.mobi.calcflat.MainActivity");
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);



    }
}
