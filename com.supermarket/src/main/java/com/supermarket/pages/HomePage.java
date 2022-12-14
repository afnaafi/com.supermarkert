package com.supermarket.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;
import com.supermarket.utilities.WaitUtility;

public class HomePage {
	WebDriver driver;
	GeneralUtilities generalutilities;
	PageUtility pageutility;
	WaitUtility waitutility;

	@FindBy(xpath = "//nav[@class='main-header navbar navbar-expand navbar-dark navbar-dark']")
	private WebElement navBar;
	@FindBy(xpath = "//div[@class='col-lg-3 col-6']")
	private WebElement boxes;
	@FindBy(xpath = "//div[@class='small-box bg-info']//p[contains(text(),'Manage Pages')]")
	private WebElement  box1Text;
	@FindBy(xpath = "//div[@class='small-box bg-info']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']")
	private WebElement box1Link;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']")
	private WebElement table1;
	@FindBy(xpath = "//div[@class='col-sm-6']//h1")
	private WebElement manageContentPageHeading;
	@FindBy(xpath = "//li[@class='nav-item dropdown']")
	private WebElement userNameId;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'][1]")
	private WebElement logout;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String get_textOfElement() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.get_TextOfElement(box1Text);
	}

	public List<String> get_TextsOfBoxes() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.get_TextOfElement("boxes");
	}

	public String get_colourofbox() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.get_Css(boxes, "background-color");
	}

	public void clickOnLink() {
		waitutility = new WaitUtility(driver);
		box1Link.click();
	}

	public String currentUrl() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.get_CurrentUrl();
	}

	public boolean isManageContentPageHeadingPresent(String expectedText) {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.is_ExpectedTextPresent(manageContentPageHeading, expectedText);
	}

	public void user_LogOut() {
		userNameId.click();
		logout.click();

	}

}
