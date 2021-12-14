package Welcome_Page_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Ele
{
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	WebElement Bnk_Id;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")
	WebElement Usr_Nme;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")
	WebElement Usr_Pswd;
	
	@FindBy(xpath = "//*[@id=\"clicked_when_enter_id\"]")
	WebElement Lgn_Btn;
	
	public Login_Page_Ele(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String Bank_Id(String Banker_Id)
	{
		Bnk_Id.sendKeys(Banker_Id);
		return Banker_Id;
	}
	
	public String User_Name(String BankerUser_Name)
	{
		Usr_Nme.sendKeys(BankerUser_Name);
		return BankerUser_Name;
	}
	public String User_Password(String BankerUser_Password)
	{
		Usr_Pswd.sendKeys(BankerUser_Password);
		return BankerUser_Password;
	}
	
	public void Login_Btn()
	{
		Lgn_Btn.click();			
	}

}
