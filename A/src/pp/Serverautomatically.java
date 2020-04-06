package pp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Serverautomatically {

	public static void main(String[] args) throws MalformedURLException {
		AppiumDriverLocalService service = null;
		try
		{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"SR");
		d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		d.setCapability("uiautomator2ServerLaunchTimeout",40000);
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),d);
		driver.get("https://www.myntra.com/");
		
		}
		finally
		{
			service.stop();
		}
		
		

	}

}
