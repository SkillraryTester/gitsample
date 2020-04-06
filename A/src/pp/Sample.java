package pp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sample {
	@Test
	public void demo() throws MalformedURLException
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"SR");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.gm");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.gm.ConversationListActivityGmail");
		//d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		d.setCapability("uiautomator2ServerLaunchTimeout",20000);
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),d);
	
		
	}
		

}
