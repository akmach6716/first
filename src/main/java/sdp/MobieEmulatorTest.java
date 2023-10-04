package sdp;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.Network;
import org.openqa.selenium.devtools.v115.emulation.Emulation;
public class MobieEmulatorTest {
	public static void main(String[] args) {
		ChromeDriver  driver= new ChromeDriver();
    DevTools devTools = driver.getDevTools();
    devTools.createSession();
   //driver.executeCdpCommand(org.openqa.selenium.devtools.v116.network.Network.enable(Optional.empty(), null, null), null)
	}

}
