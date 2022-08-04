package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private WebDriver wd;
	private By Username=By.id("txtUsername");
	private By password=By.id("txtPassword");
	private By submit= By.id("btnLogin");
	private By admin=By.xpath("//*[text()='Admin']");
	public Loginpage(WebDriver wd) {
		this.wd=wd;
	}
	
	public String login(Login login) {
		wd.findElement(Username).sendKeys(login.getUsername());
		wd.findElement(password).sendKeys(login.getPassword());
		wd.findElement(submit).click();
		return wd.findElement(admin).getText();
	}
}
