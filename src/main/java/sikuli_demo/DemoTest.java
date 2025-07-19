package sikuli_demo;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.Assert;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		Screen screen = new Screen();
		
		Pattern image8 = new Pattern("C:\\Users\\kppra\\eclipse-workspace\\Sikuli\\images\\8.png");
		Pattern multiply = new Pattern("C:\\Users\\kppra\\eclipse-workspace\\Sikuli\\images\\multiply.png");
		Pattern image3 = new Pattern("C:\\Users\\kppra\\eclipse-workspace\\Sikuli\\images\\3.png");
		Pattern equals = new Pattern("C:\\Users\\kppra\\eclipse-workspace\\Sikuli\\images\\equals.png");
		
		Pattern result = new Pattern("C:\\Users\\kppra\\eclipse-workspace\\Sikuli\\images\\result.png");
//		Pattern result = new Pattern("C:\\Users\\kppra\\eclipse-workspace\\Sikuli\\images\\invalid.png");
//		System.out.println(invalid_result);
		
		screen.click(image8);
		screen.click(multiply);
		screen.click(image3);
		screen.click(equals);
		
		if(screen.exists(result.similar(0.95)) != null) 
		{
			System.out.println("Matches");
		}
			else
			{
				System.out.println("Not matches");
			}
	}
}
