package BDD.Cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	//WebDriver driver;
	//WebElement element;

@FindBy(how=How.XPATH , using ="//img[@itemprop='logo']")
public WebElement title;
	
@FindBy(how=How.LINK_TEXT , using ="Login")	
public WebElement loginIcon;

@FindBy(xpath="html/body/div[9]/div[2]/div[2]/form/div[4]/div[2]/input")	
WebElement username;

@FindBy(how=How.XPATH , using ="//input(contains(@placeholder,'password')])")	
WebElement password;

@FindBy(how=How.XPATH , using ="//button([@type='submit'])")	
WebElement loginBtn;

public void login(String uName, String pswd){
	
	username.sendKeys(uName);
	password.sendKeys(pswd);
	loginBtn.click();
	
}

}
