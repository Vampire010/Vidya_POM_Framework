package Test_Runner;

import org.openqa.selenium.WebDriver;

import Browser_Config.Browser_Launcher;
import Welcome_Page_Elements.Login_Page_Ele;

public class Login_Page_Test  extends Browser_Launcher
{


	public static void main(String[] args) 
	{
		String browser_type ="edge";
		String test_url ="http://mykidsbank.org/";
		
		Login_Page_Test test = new Login_Page_Test();
		test.browser(browser_type, test_url);
		
		Login_Page_Ele lp = new Login_Page_Ele(driver);
		lp.Bank_Id("71225");
		lp.User_Name("banker");
		lp.User_Password("girish1234");
		lp.Login_Btn();
	}
	

}
