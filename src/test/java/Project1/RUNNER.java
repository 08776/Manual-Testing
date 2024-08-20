package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(
		features= {"src\\test\\resources\\prog.feature"},
		dryRun=true
		)


public class RUNNER extends BaseClass {
	
	// for scenario 1
	@Given("To launch the chrome and maximize the window")
	public void to_launch_the_chrome_and_maximize_the_window() {
		launchbrowser();
	}

	@When("To launch the url of the SCENT")
	public void to_launch_the_url_of_the_SCENT() {
		launchURl("https://scentarts.ae/");
	}

	@When("To Click the About Us button")
	public void to_Click_the_About_Us_button() {
		FBLOGIN pojo=new FBLOGIN();
		clickbtn(pojo.getAbout());
	}

	@When("Scroll down to the Area of Scenting Section")
	public void scroll_down_to_the_Area_of_Scenting_Section() {
		FBLOGIN pojo=new FBLOGIN();
		scrollpage(pojo.getScroll1());
		
	}

	@When("Click the hotel menu button")
	public void click_the_hotel_menu_button() {
		FBLOGIN pojo=new FBLOGIN();
		clickbtn(pojo.getHotel());
		
	}

	@When("Print the description of the under the hotel menu")
	public void print_the_description_of_the_under_the_hotel_menu() {
		WebElement txt=drive.findElement(By.xpath("//p[text()='Smell provides guests with a sense of orientation before the visual role is fully established.']"));
		String text = txt.getText();
		System.out.println("Scenario1: "+text);
		
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeentirebrowser();
		
	}
	
	
	// for scenario 2
	@When("To Navigate into the webPage")
	public void to_Navigate_into_the_webPage() {
		launchURl("https://scentarts.ae/");
	}

	@When("To Click the Our Services button")
	public void to_Click_the_Our_Services_button() {
		FBLOGIN pojo=new FBLOGIN();
		clickbtn(pojo.getService());
	}

	@When("Scroll down to see the Contact Us button")
	public void scroll_down_to_see_the_Contact_Us_button() {
		FBLOGIN pojo=new FBLOGIN();
		scrollpage(pojo.getContactus());
	}

	@When("To Click the Contact Us button")
	public void to_Click_the_Contact_Us_button() {
		FBLOGIN pojo=new FBLOGIN();
		clickbtn(pojo.getClickcontactus());
	}

	@When("To pass the name")
	public void to_pass_the_name() {
		FBLOGIN pojo=new FBLOGIN();
		passtext("Velmurugan E",pojo.getName());
	}

	@When("To pass the Company Name")
	public void to_pass_the_Company_Name() {
		FBLOGIN pojo=new FBLOGIN();
		passtext("Inamkes Infotech",pojo.getCompanyname());	
	}

	@When("To pass the phone number")
	public void to_pass_the_phone_number() {
		FBLOGIN pojo=new FBLOGIN();
		passtext("8283847299",pojo.getPh());
	}

	@When("To pass the mail id")
	public void to_pass_the_mail_id() {
		FBLOGIN pojo=new FBLOGIN();
		passtext("Inamkes@1010",pojo.getMail());
	}

	@When("To select the elementary in the dropdown box")
	public void to_select_the_elementary_in_the_dropdown_box() {
		FBLOGIN pojo=new FBLOGIN();
		Select s=new Select(pojo.getSelectelement());
		List<WebElement> allSelectedOptions = s.getOptions();
		WebElement k=allSelectedOptions.get(3);
		String text1 =k.getText();
		System.out.println("Scenario2: "+text1);
		k.click();
	}

	@When("To pass the Country")
	public void to_pass_the_Country() {
		FBLOGIN pojo=new FBLOGIN();
		passtext("India",pojo.getCountry());
	}

	@When("To scroll Down into home page")
	public void to_scroll_Down_into_home_page() {
		FBLOGIN pojo=new FBLOGIN();
		scrollpage(pojo.getScrolltohome());
	}

	@Then("close the browser")
	public void close_the_browser() {
		closeentirebrowser();
	}




}
