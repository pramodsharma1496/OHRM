package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	private static final AddEmployee AddEmployee = null;
	private static WebDriver wd;
	private Loginpage loginpage; 
	private AddEmployeePage addemployeepage;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			loginpage=new Loginpage(wd);
			addemployeepage=new AddEmployeePage(wd);

	}
	
	@Test(priority = 1)
	public void loginTest() {
		Login login=new Login("Admin", "admin123");
	String Actual	=loginpage.login(login);
	Assert.assertEquals(Actual, "Admin");
	System.out.println("login complete");
		
	}
	
	@Test(priority = 2)
	public void addEmployee() throws InterruptedException   {
		AddEmployee addemp = new AddEmployee("Pramod", "Sharma");
	 String Actual =   addemployeepage.addEmployee(addemp);
		Assert.assertEquals(Actual, "Personal Details","failed");
		System.out.println("EMP added");
		
	}
	
	@AfterTest
	public void teardown() {
		wd.close();
	}

}
