package BDD.Cucumber;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import BDD.Cucumber.pom.*;

public class stepDefinition {
	
	WebDriver driver;
	Login objLogin;
	
	@Given("^Go to URL$")
	public void go_to_URL(){

		File pathBinary = new File("C:\\Users\\ABHISHEK\\Downloads\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffbinary = new FirefoxBinary(pathBinary);
		FirefoxProfile ffprofile = new FirefoxProfile();
		driver = new FirefoxDriver(ffbinary,ffprofile);
		driver.get("https://www.naukri.com");
		System.out.println("Checking git and GITHUB");
		objLogin = PageFactory.initElements(driver,Login.class);
		
	}

	@When("^Verify title$")
	public void verify_title() {

		try{
			objLogin.title.isDisplayed();
			System.out.println("Displayed title");
		}catch(Exception e){			
			e.printStackTrace();
			
		}
		
	}

	@When("^Click login icon$")
	public void click_login_icon() {
		
		try{
			objLogin.loginIcon.click();
		}catch(Exception e){			
			e.printStackTrace();		
		}
		
	}

	@When("^Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void username_and_Password(String uName, String pswd){
	    
		try{
			objLogin.login(uName, pswd);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@When("^Click Login button$")
	public void click_Login_button(){
	    
	}

	@Then("^Login Success$")
	public void login_Success(){
	    
	}

	@When("^Verify Home page$")
	public void verify_Home_page() {
	   
	}

	@When("^Click My Profile$")
	public void click_My_Profile(){
	    
	}

	@Then("^Logout from Naukri app$")
	public void logout_from_Naukri_app() {
	   
	}

}
