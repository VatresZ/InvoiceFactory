package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessPage extends PageObject {

	public BusinessPage(WebDriver driver) {
		super(driver);
	}

	// ****elementi
	// dodavanje novog business i prelaz na NewBusinessPage
	@FindBy(id = "nav-bar-business")
	WebElement Business;

	@FindBy(id = "expand-business-details")
	WebElement detailsBusiness;

	@FindBy(id = "close-business-details")
	WebElement closeBusiness;

	// ovaj button ima alert (napraviti slucaj za Yes i No)
	@FindBy(xpath = "html/body/div[1]/div[4]/main/div/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/button")
	WebElement deleteBusiness;

	// button alert No
	@FindBy(id = "context-download-dialog-no-36")
	WebElement dialogNoDeleteBusiness;

	// button alert Yes
	@FindBy(id = "context-download-dialog-yes-36")
	WebElement dialogYesDeleteBusiness;

	// radi isto kao dodavanje sa bord page
	@FindBy(id = "business-edit-btn-36")
	WebElement editBusiness;

	@FindBy(xpath = "html/body/div[1]/div[12]/main/div/div/div[2]/div[2]/div/form/div[1]/div[2]/ul[1]/li/div[1]")
	WebElement rsdAccount;

	@FindBy(xpath = "html/body/div[1]/div[12]/main/div/div/div[2]/div[2]/div/form/div[1]/div[2]/ul[2]")
	WebElement euroAccount;

	@FindBy(xpath = "html/body/div[1]/div[12]/main/div/div/div[2]/div[2]/div/form/div[1]/div[2]/ul[3]")
	WebElement usdAccount;

	@FindBy(id = "bank-expanded-edit-btn")
	WebElement editRSDAccount;

	@FindBy(id = "bank-expanded-edit-btn")
	WebElement editAccount;

	@FindBy(id = "context-delete-88")
	WebElement deleteAccount;

	@FindBy(xpath = "html/body/div[1]/div[10]/main/div/div/div[1]/div/div/a")
	WebElement backToBusiness;

	@FindBy(id = "context-download-dialog-yes-36")
	WebElement deleteYesAccount;

	@FindBy(id = "context-download-dialog-no-36")
	WebElement deleteNoAccount;

	// ***metoda koja definise sta se radi nad elementima
	public void toNewBusiness() {
		Business.click();
	}

	public void toDetailsBusiness() {
		detailsBusiness.click();
	}

	public void toCloseDetailsBusiness() {
		closeBusiness.click();
	}

	public void toDeleteBusiness() {
		deleteBusiness.click();
	}

	public void toNoDialog() {
		dialogNoDeleteBusiness.click();
	}

	public void toYesoDialog() {
		dialogYesDeleteBusiness.click();
	}

	public void toEditBusiness() {
		editBusiness.click();
	}

	public void toRSDAccount() {
		rsdAccount.click();
	}

	public void toEUROAccount() {
		euroAccount.click();
	}

	public void toUSDAccount() {
		usdAccount.click();
	}

	public void toEditccount() {
		editAccount.click();
	}

	public void toDeleteccount() {
		deleteAccount.click();
	}

	public void toBackToBusiness() {
		backToBusiness.click();
	}

	public void toDeleteNoAccount() {
		deleteNoAccount.click();
	}

	public void toDeleteYesAccount() {
		deleteYesAccount.click();
	}

	// ***verifikacija

	// verifikacija da elementi postoje************
	// metoda verifikacije postojanja newBusiness
	public boolean isNewBusiness() {
		return Business.isDisplayed();
	}

	// metoda verifikacije postojanja detailsBusiness
	public boolean isDetailsBusiness() {
		return detailsBusiness.isDisplayed();
	}

	// metoda verifikacije postojanja newBusiness
	public boolean isCloseBusiness() {
		return closeBusiness.isDisplayed();
	}

	// metoda verifikacije postojanja newBusiness
	public boolean isDeleteBusiness() {
		return deleteBusiness.isDisplayed();
	}

	// metoda verifikacije postojanja newBusiness
	public boolean isEditBusiness() {
		return editBusiness.isDisplayed();
	}

	// *****************************

}
