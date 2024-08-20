package Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLOGIN extends BaseClass {
	public FBLOGIN()
	{
		PageFactory.initElements(drive, this);
	}
	// for scenario 1
	@FindBy(xpath="(//a[text()='About Us'])[1]")
	private static WebElement about;
	
	@FindBy(xpath="//h2[text()='FAQs']")
	private static WebElement scroll1;
	
	@FindBy(xpath="//a[text()='Hotels']")
	private static WebElement hotel;
	
	//for scenario 2
	@FindBy(xpath="(//span[text()='Our Services'])[2]")
	private static WebElement service;
	
	@FindBy(xpath="(//span[text()='Contact Us'])[3]")
	private static WebElement contactus;
	
	@FindBy(xpath="(//span[text()='Contact Us'])[3]")
	private static WebElement clickcontactus;
	
	@FindBy(xpath="//input[@placeholder='Full Name']")
	private static WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Company Name']")
	private static WebElement companyname;
	
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	private static WebElement ph;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private static WebElement mail;
	
	@FindBy(xpath="//select[@class='elementor-field-textual elementor-size-sm']")
	private static WebElement selectelement;
	 
	@FindBy(xpath="//input[@placeholder='Country Name']")
	private static WebElement country;
	
	@FindBy(xpath="(//span[text()='Home'])[2]")
	private static WebElement scrolltohome;
	
	public static WebElement getScrolltohome() {
		return scrolltohome;
	}

	public static WebElement getCountry() {
		return country;
	}

	public static WebElement getSelectelement() {
		return selectelement;
	}

	public static WebElement getCompanyname() {
		return companyname;
	}

	public static WebElement getPh() {
		return ph;
	}

	public static WebElement getMail() {
		return mail;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getClickcontactus() {
		return clickcontactus;
	}

	public static WebElement getContactus() {
		return contactus;
	}

	public static WebElement getService() {
		return service;
	}

	public static WebElement getHotel() {
		return hotel;
	}

	public static WebElement getAbout() {
		return about;
	}

	public static WebElement getScroll1() {
		return scroll1;
	}

	
	
	
}
