package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewBusinessPage extends PageObject {

	public NewBusinessPage(WebDriver driver) {
		super(driver);
	}

	// ************elementi
	@FindBy(id = "bank-dialog-cancel")
	WebElement backToBusiness;

	@FindBy(id = "home-page-user")
	WebElement nameNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[6]/main/div/div/div[2]/div[2]/div/form/div[1]/div[1]/form/div[1]/div/div[2]/div[2]/div/div/div")
	WebElement nameMsgNewBusiness;

	// ovo je odabir zemlje iz padajuceg menija
	@FindBy(id = "business-form-country")
	WebElement countryNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[6]/main/div/div/div[2]/div[2]/div/form/div[1]/div[1]/form/div[2]/div/div[2]/div[2]/div/div/div")
	WebElement countryMsgNewBusiness;

	@FindBy(id = "business-form-city")
	WebElement cityNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[6]/main/div/div/div[2]/div[2]/div/form/div[1]/div[1]/form/div[3]/div/div[2]/div[2]/div/div/div")
	WebElement cityMsgNewBusiness;

	@FindBy(id = "business-form-street")
	WebElement streetNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[6]/main/div/div/div[2]/div[2]/div/form/div[1]/div[1]/form/div[4]/div/div[2]/div[2]/div/div/div")
	WebElement streetMsgNewBusiness;

	@FindBy(id = "business-form-zip")
	WebElement zipNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[6]/main/div/div/div[2]/div[2]/div/form/div[1]/div[1]/form/div[5]/div/div[2]/div[2]/div/div/div")
	WebElement zipMsgNewBusiness;

	@FindBy(id = "business-form-reg-num")
	WebElement regNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[6]/main/div/div/div[2]/div[2]/div/form/div[1]/div[1]/form/div[6]/div/div[2]/div[2]/div/div/div")
	WebElement regMsgNewBusiness;

	@FindBy(id = "business-form-save-btn")
	WebElement saveNewBusiness;

	// Dialog AddBank koji se pounjava
	@FindBy(id = "business-form-add-bank-btn")
	WebElement bankNewBusiness;

	@FindBy(id = "bank-dialog-name")
	WebElement nameBankDialogNewBusiness;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div/div[2]/div[2]/div/div/div")
	WebElement nameMsgDialogNewBusiness;

	@FindBy(id = "bank-dialog-num")
	WebElement accountNewDialogBusiness;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/form/div[2]/div/div[2]/div[2]/div/div/div")
	WebElement accountMsgDialogNewBusiness;

	@FindBy(id = "bank-dialog-swf-num")
	WebElement swiftNewDialogBusiness;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div[2]/div/div/div")
	WebElement swiftMsgDialogNewBusiness;

	@FindBy(id = "bank-dialog-pay-inst")
	WebElement paymentNewDialogBusiness;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/form/div[4]/div/div[2]/div[2]/div/div/div")
	WebElement peymentMsgNewDialogBusiness;

	// padajuci meni za izbor rsd, euro i dolara
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/form/div[5]/div/div[2]/div[1]/div/div/div/div[1]")
	WebElement currencyNewDialogBusiness;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/form/div[5]/div/div[2]/div[2]/div/div/div")
	WebElement currencyMsgNewDialogBusiness;

	@FindBy(id = "bank-dialog-cancel")
	WebElement cancelNewDialogBusiness;

	@FindBy(id = "bank-dialog-add-bank")
	WebElement addBankNewDialogBusiness;

	// ****metoda koja definise sta se radi nad elementima
	// Name new bank
	public void toNameNewBusiness() {
		nameNewBusiness.click();
	}

	// Country new bank
	public void toCountryNewBusiness() {
		countryNewBusiness.click();
	}

	public void fillDataCountryNewBusiness(String name) {
		countryNewBusiness.sendKeys(name);
	}

	// City new bank
	public void toCityNewBusiness() {
		cityNewBusiness.click();
	}

	public void fillDataCityNewBusiness(String name) {
		cityNewBusiness.sendKeys(name);
	}

	// Street new bank
	public void toStreetNewBusiness() {
		streetNewBusiness.click();
	}

	public void fillDataStreetNewBusiness(String name) {
		streetNewBusiness.sendKeys(name);
	}

	// Zip code new bank
	public void toZipNewBusiness() {
		zipNewBusiness.click();
	}

	public void fillDataZipNewBusiness(String name) {
		zipNewBusiness.sendKeys(name);
	}

	// Key for new bank
	public void toRegNewBusiness() {
		regNewBusiness.click();
	}

	public void fillDataRegNewBusiness(String key) {
		regNewBusiness.sendKeys(key);
	}

	// *************************
	// new bank account
	public void toBankNewBusiness() {
		bankNewBusiness.click();
	}

	// name new bank
	public void toNameBankDialogNewBusiness() {
		nameBankDialogNewBusiness.click();
	}

	public void fillDataNameBankDialogNewBusiness(String name) {
		nameBankDialogNewBusiness.clear();
		nameBankDialogNewBusiness.sendKeys(name);
	}

	// account new bank
	public void toAccountNewDialogBusiness() {
		accountNewDialogBusiness.click();
	}

	public void fillDataAccountNewDialogBusiness(String num) {
		accountNewDialogBusiness.clear();
		accountNewDialogBusiness.sendKeys(num);
	}

	// swift new bank
	public void toSwiftNewDialogBusiness() {
		swiftNewDialogBusiness.click();
	}

	public void fillDataSwiftNewDialogBusiness(String key) {
		swiftNewDialogBusiness.clear();
		swiftNewDialogBusiness.sendKeys(key);
	}

	// payment new bank
	public void toPaymentNewDialogBusiness() {
		paymentNewDialogBusiness.click();
	}

	public void fillDataPaymentNewDialogBusiness(String key) {
		paymentNewDialogBusiness.clear();
		paymentNewDialogBusiness.sendKeys(key);
	}

	// Currency new bank
	public void toCurrencyNewDialogBusiness() {
		currencyNewDialogBusiness.click();
	}

	public void fillDataCurrencyNewDialogBusiness(String name) {
		currencyNewDialogBusiness.clear();
		currencyNewDialogBusiness.sendKeys(name);
	}

	// Cancel add new bank
	public void toCancelNewDialogBusiness() {
		cancelNewDialogBusiness.click();
	}

	// Add new bank
	public void toAddBankNewDialogBusiness() {
		addBankNewDialogBusiness.click();
	}

	// *********************
	// Save to Business list
	public void toSaveNewBusiness() {
		saveNewBusiness.click();
	}

	// Back to Business list
	public void toBackToBusiness() {
		backToBusiness.click();
	}

}