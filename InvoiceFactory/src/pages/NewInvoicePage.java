package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewInvoicePage extends PageObject {

	public NewInvoicePage(WebDriver driver) {
		super(driver);
	}

	// ************elementi
	// elementi new invoices**

	@FindBy(id = "click-to-enter")
	WebElement enterText;
	@FindBy(id = "invoice-title-content")
	WebElement enterFillText;
	@FindBy(css = "div#app main > div")
	WebElement selectDraftInvoices;
	@FindBy(xpath = "html/body/div[1]/div[6]/div/div/div[1]/a")
	WebElement selectDraftDraftInvoices;
	@FindBy(className = "v-select__selections")
	List<WebElement> toSlectClient;
	@FindBy(xpath = "html/body/div[1]/div[6]/div/div")
	List<WebElement> selectToClient;
	
	@FindBy(xpath = "//*[text()[contains(.,'Jovan Jovanovic')]]")
	WebElement toSlect1Client;
	@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[3]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]")
	WebElement fromSlectClient;
	@FindBy(xpath = "html/body/div[1]/div[4]/div/div/div[1]/a")
	WebElement fromTextSlectClient;
	@FindBy(id = "inv-form-basis")
	WebElement basisInvoices;
	@FindBy(xpath = "html/body/div[1]/div[9]/main/div/div/div/div[1]/form/div[1]/div[4]/div[4]/div/div/div[2]/div[1]/div/input")
	WebElement basisTextInvoices;
	@FindBy(css = "#app > div.application--wrap > main > div > div > div > div.invoice-factory-header.v-card > form > div.layout.pa-3.column > div:nth-child(5) > div > div.layout.mt-1 > div.flex.xs4.offset-xs4 > div > div.flex.xs4.ml-2 > div > div > div.v-input__slot > div > div > div")
	WebElement currencyInvoices;
	@FindBy(xpath = "html/body/div[1]/div[3]/div/div/div[1]/a")
	WebElement currencyDinarInvoices;
	@FindBy(xpath = "html/body/div[1]/div[3]/div/div/div[2]/a")
	WebElement currencyEuroInvoices;
	@FindBy(css = "button#add-content-btn > div")
	WebElement addContentInvoices;
	@FindBy(id = "inv-form-service-0")
	WebElement addServiceInvoices;
	@FindBy(id = "inv-form-note-0")
	WebElement addNoteInvoices;
	@FindBy(id = "inv-form-days-0")
	WebElement addDaysInvoices;
	@FindBy(id = "inv-form-hours-0")
	WebElement addHoursInvoices;
	@FindBy(id = "inv-form-rate-0")
	WebElement addRateInvoices;
	@FindBy(id = "context-delete-inv-content-delete-0")
	WebElement deleteContentInvoices;
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div[3]/button[2]")
	WebElement deleteYesContentInvoices;
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div/div[3]/button[1]")
	WebElement deleteNoContentInvoices;
	@FindBy(id = "inv-form-discount")
	WebElement discountInvoices;
	@FindBy(id = "inv-form-tax")
	WebElement taxInvoices;
	@FindBy(css = "#app > div.application--wrap > main > div > div > div > div.invoice-factory-header.v-card > form > div.layout.pa-3.column > div.flex.mt-5 > div > div.layout.row.justify-space-between > div.flex.xs2 > div > div > div.v-input__slot > div > div > div")
	WebElement selectBankInvoice;
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div")
	WebElement selectDefaultBankInvoice;
	@FindBy(id = "inv-form-cancel-btn")
	WebElement cancelNewInvoice;
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[2]/button[1]/div")
	WebElement cancelNoNewInvoice;
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[2]/button[2]/div")
	WebElement cancelYesNewInvoice;
	@FindBy(id = "inv-form-save-btn")
	WebElement saveNewInvoice;
	@FindBy(id = "inv-form-back-btn")
	WebElement backInvoice;

	// ****metoda koja definise sta se radi nad elementima

	// klik na unos naslova Invoices
	public void toEnterTextNewInvoice() {
		enterText.click();
	}

	// unos text u naslova Invoices
	public void fillTextDataNewInvoices(String text) {
		this.enterFillText.clear();
		this.enterFillText.sendKeys(text);
	}

	// klik na Select draft new Invoices
	public void toSelectDraftInvoices() {
		selectDraftInvoices.click();
	}

	// klik na Select draft draft new Invoices
	public void toSelectDraftDraftInvoices() {
		selectDraftDraftInvoices.click();
	}

	// klik na Select Clients
	public void toSlectClientInvoices() {
		toSlectClient.get(1).click();
	}

	public void toToSlect1Client() {
		wait.until(ExpectedConditions.elementToBeClickable(toSlect1Client));
		toSlect1Client.click();
	}

	// klik na Select Clients
	public void toFromSlectBusinessInvoices() {
		fromSlectClient.click();
	}

	public void toFromSlectTextBusinessInvoices() {
		fromTextSlectClient.click();
	}

	// klik na basicInvoices
	public void toBasisInvoices() {
		basisInvoices.click();
	}

	// unos text u basisInvoices
	public void fillTextDataBasisInvoices(String text) {
		basisTextInvoices.clear();
		basisTextInvoices.sendKeys(text);
	}

	// klik na Currency Client
	public void tocurrencyInvoices() {
		currencyInvoices.click();
	}

	// klik na Currency Dinar Client
	public void toCurrencyDinarInvoices() {
		currencyDinarInvoices.click();
	}

	// klik na Currency Euro Client
	public void toCurrencyEuroInvoices() {
		currencyEuroInvoices.click();
	}

	// klik na add content Invoices
	public void toAddContentInvoices() {
		addContentInvoices.click();
	}

	// klik na add service Invoices
	public void toAddServiceInvoices() {
		addServiceInvoices.click();
	}

	// unos text u add service Invoices
	public void fillTextServiceInvoices(String text) {
		addServiceInvoices.clear();
		addServiceInvoices.sendKeys(text);
	}

	// klik na Note Invoices
	public void toAddNoteInvoices() {
		addNoteInvoices.click();
	}

	// unos text u Note Invoices
	public void fillTextNoteInvoices(String text) {
		addNoteInvoices.clear();
		addNoteInvoices.sendKeys(text);
	}

	// klik na Days Invoices
	public void toDaysInvoices() {
		addDaysInvoices.click();
	}

	// unos text u Days Invoices
	public void fillTextDaysInvoices(String broj) {
		addRateInvoices.clear();
		addDaysInvoices.sendKeys(broj);
	}

	// klik na Hours Invoices
	public void toHoursInvoices() {
		addHoursInvoices.click();
	}

	// unos text u Hours Invoices
	public void fillTextHoursInvoices(String broj) {
		addRateInvoices.clear();
		addHoursInvoices.sendKeys(broj);
	}

	// klik na Rate Invoices
	public void toRateInvoices() {
		addRateInvoices.click();
	}

	// unos text u Rate Invoices
	public void fillTextRateInvoices(String broj) {
		addRateInvoices.clear();
		addRateInvoices.sendKeys(broj);
	}

	// delete content Invoices
	public void toDeleteContentInvoices() {
		deleteContentInvoices.click();
	}

	// delete Yes content Invoices
	public void toDeleteYesContentInvoices() {
		deleteYesContentInvoices.click();
	}

	// delete No content Invoices
	public void toDeleteNoContentInvoices() {
		deleteNoContentInvoices.click();
	}

	// discount Invoices
	public void toDiscountInvoices() {
		discountInvoices.click();
	}

	// unos discount Invoices
	public void fillDiscountInvoices(String broj) {
		wait.until(ExpectedConditions.elementToBeClickable(discountInvoices));
		discountInvoices.click();
		discountInvoices.clear();
		discountInvoices.sendKeys(broj);
	}

	// tax Invoices
	public void toTaxInvoices() {
		taxInvoices.click();
	}

	// unos tax Invoices
	public void fillTaxInvoices(String broj) {
		wait.until(ExpectedConditions.elementToBeClickable(taxInvoices));
		taxInvoices.click();
		taxInvoices.clear();
		taxInvoices.sendKeys(broj);
	}

	// Select Bank Invoices
	public void toBankInvoices() {
		selectBankInvoice.click();
	}

	// Select default Bank Invoices
	public void toSelectDefaultBankInvoice() {
		selectDefaultBankInvoice.click();
	}

	// Cancel new Invoices
	public void toCancelNewInvoice() {
		cancelNewInvoice.click();
	}

	public void toCancelNoNewInvoice() {
		cancelNoNewInvoice.click();
	}

	public void toCancelYesNewInvoice() {
		cancelYesNewInvoice.click();
	}

	// Save new Invoices
	public void toSaveNewInvoice() {
		saveNewInvoice.click();
	}

	// Back new Invoices
	public void toBackInvoice() {
		backInvoice.click();
	}

}