package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public void ClickScreenShot(WebDriver driver,String name) throws IOException {
  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination=new File("C:\\Users\\Pri\\Documents\\ScreenShot\\"+name+".gif");
	FileHandler.copy(source, Destination);
}
}
