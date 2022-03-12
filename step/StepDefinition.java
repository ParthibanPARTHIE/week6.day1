package step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
	String leadID;
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@And("Load the application URL {string}")
	public void loadApplicationurl(String string) {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the username as {string}")
	public void username(String string) {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	@And("Enter the password as {string}")
	public void password(String string) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@And("Click on Login button")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("Click CRM link")
	public void crmlink() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click on Leads link")
	public void leadslink() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leads")).click();
	}	
	@Given("Click on Create Leads button")
	public void click_on_create_leads_button() throws InterruptedException {
	Thread.sleep(1000);
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter CompanyName as {string}")
	public void enter_company_name_as(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}

	@And("Enter FirstName as {string}")
	public void enter_first_name_as(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}

	@And("Enter LastName as {string}")
	public void enter_last_name_as(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@And("Click on Create Lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Given("Click on Find Leads button")
	public void find_leads_button() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Click on the phone tab")
	public void click() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@And("Enter the phone number as {int}")
	public void phone_number(int phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(""+phoneNumber);
		
	}
	
	
	@And("Click on Find the Leads button")
	public void click_on_the_find_leads_button() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@And("Click on the Lead ID from the result")
	public void Click_on_the_Lead_ID_from_the_result() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@And("Click on the Edit button")
	public void click_on_the_edit_lead_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Change the Company name as {string}")
	public void change_the_company_name_as(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}
	@And("Save the Lead ID as leadId")
	public void Save_the_Lead_ID_as_leadId() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
	}
	
	@And("Click on the Delete Lead button")
	public void click_on_the_delete_lead_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@And("Click on Find Leads")
	public void click_on_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	

	@And("Enter the leadID in Lead ID tab")
	public void enter_the_lead_id_in_lead_id_tab() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	
	@Then("Validate the result")
	public void validate_the_result() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	
	
	

	
	
}
