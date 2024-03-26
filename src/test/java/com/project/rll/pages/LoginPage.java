package com.project.rll.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.rll.utility.XLUtility;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='toolbar-account']")
	WebElement login;

	@FindBy(xpath = "//input[@id='customer_email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='customer_password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[@class='more-link']")
	WebElement logout;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void click_Login() {
		login.click();
	}

	public void enter_Credentials(String id, String pwd) throws IOException, InterruptedException {

		email.sendKeys(id);

		password.sendKeys(pwd);

	}

	public void click_LoginBtn() {
		loginBtn.click();
	}

	public void click_Logout() {
		logout.click();
	}

	public String validateUrl() {
		String actualUrl = driver.getCurrentUrl();

		return actualUrl;
	}

}
