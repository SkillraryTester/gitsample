package Learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dataproviderprogram {
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="userA";
		a[0][1]="userA";
		a[1][0]="userA";
		a[1][1]="userA";
		a[2][0]="userA";
		a[2][1]="userA";
		return a;
				
	}
	@Test(dataProvider="getdata")
	public void creteuser(String us,String pwd) throws MalformedURLException
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"SR");
		d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		d.setCapability("uiautomator2ServerLaunchTimeout",40000);
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),d);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

}
