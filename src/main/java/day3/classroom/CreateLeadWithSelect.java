package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
		// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("LNC");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Priya");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Vino");

		// Select 'Source' as 'Other' (Handling DropDown)
		Select sourceDD = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		sourceDD.selectByVisibleText("Other");
		// Select 'Preferred Currency' as 'INR'
		Select currencyDD = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		currencyDD.selectByValue("INR");
		// Select 'Industry' as 'Finance'
		Select industryDD = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industryDD.selectByIndex(5);
		// Select 'Owner' as last value using list
		Select ownerDD = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		List<WebElement> options = ownerDD.getOptions();
		int values = options.size();
		ownerDD.selectByIndex(values-1);
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		if (companyName.contains("LNC")) {
			System.out.println("Lead is created successfully");
		}
		else {
			System.out.println("Lead is not created yet");
		}
		driver.close();
	}
}
