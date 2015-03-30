import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jose on 3/29/15.
 */

public class HotelTonightTest {

    public static DesiredCapabilities getDesiredCapabilities (String udid) {

        DesiredCapabilities dc = new DesiredCapabilities ();
        dc.setCapability ("platformName", "Android");
        dc.setCapability ("platformVersion", "4.4");
        dc.setCapability ("deviceName", "Google Nexus 4");
        dc.setCapability ("browserName", "chrome");// or "Browser"); ?
        //dc.setCapability ("app", "Chrome");
        //dc.setCapability ("appPackage", "com.android.chrome");
        //dc.setCapability (“app-activity”,”.NotesList”);
        dc.setCapability ("udid", udid);
        return dc;
    }


    public static void main (String [] args) throws MalformedURLException, InterruptedException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

        WebDriver webDriver = new AndroidDriver (serverAddress, getDesiredCapabilities ("127.0.0.1:5555"));
        // WebDriver webDriver = new AppiumDriver (serverAddress, getDesiredCapabilities(“emulator-5554”));

        try {
            /*
            NoteUtilities.createNote(driver, “I didn’t expect a kind of Spanish Inquisition!”);
            Thread.sleep(2000);

            NoteUtilities.createNote(driver, “Nobody expects the Spanish Inquisition!”);
            Thread.sleep(2000);

            NoteUtilities.clearNoteByText(driver, “I didn’t expect a kind of Spanish Inquisition!”);
            */
            Thread.sleep(2000);

        } finally {
            webDriver.quit();
        }
    }

}

