package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
@FindBy(xpath="//input[@id='email']")private WebElement email;
@FindBy(xpath="//input[@id='pass']")private WebElement password;
@FindBy(xpath="//button[@id='loginbutton']")private WebElement login;
@FindBy(xpath="//a[text()='Forgotten account?']")private WebElement Forgottonaccount;
@FindBy(xpath="//a[text()='Sign up for Facebook']")private WebElement signupforfacebook;

public LogInPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void EnterEmailId(String id) {
	email.sendKeys(id);
}
public void EnterPassword(String pass) {
	password.sendKeys(pass);
}
public void ClickOnLogIn() {
	login.click();
}
public void ClickOnForgottonAc() {
	Forgottonaccount.click();
}
public void ClickonSignup() {
	signupforfacebook.click();
}
}
