package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
	
	
	private WebDriver wd;
	private By addButton = By.id("btnAdd");
	private By firstName = By.id("firstName");
	private By lastName = By.id("lastName");
	private By empID = By.id("employeeId");
	private By saveBtn = By.id("btnSave");
	
    public AddEmployeePage(WebDriver wd) {
    	this.wd=wd;
    }
    
    public String addEmployee(AddEmployee addEmployee) throws InterruptedException {
    	wd.findElement(By.xpath("//*[text()='PIM']")).click();
    	Thread.sleep(2000);
		wd.findElement(addButton).click();
		wd.findElement(firstName).sendKeys(addEmployee.getFirstName());
		wd.findElement(lastName).sendKeys(addEmployee.getLastName());
		//wd.findElement(empID).sendKeys(addEmployee.getEmpID());
		wd.findElement(saveBtn).click();
	return	wd.findElement(By.xpath("//*[text()='Personal Details']")).getText();
		
    }
}
