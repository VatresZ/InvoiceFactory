package tests;

import org.testng.annotations.Test;
import pages.BordPage;
import pages.BusinessPage;
import pages.LoginPage;
import pages.NewBusinessPage;
import pages.NewInvoicePage;

public class NewInvoiceTest extends InitTest {
	LoginPage logPage;
	BordPage bordPage;
	NewInvoicePage newInvPage;
	BusinessPage busPage;
	NewBusinessPage newBusPage;

	// 41 Unos svih podataka bez unosa title invoice i save
	@Test(priority = 41)
	public void test41() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// pozivanje metoda
		Thread.sleep(2000);
		bordPage.toNewInv();// open new invoicess
		Thread.sleep(2000);
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("5");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("20");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// The title field is required.
	}

	// 42 Unos podataka bez toSelect i save
	@Test(priority = 42)
	public void test42() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("5");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("20");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// assertTrue(toSelect)
	}

	// 43 Unos podataka bez fromSelect i save
	@Test(priority = 43)
	public void test43() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// assertTrue(From Slect)
		// assertTrue(Currency)
		// assertTrue(Add Note Invoices)
	}

	// 44 Unos podataka bez unosa stavki i save
	@Test(priority = 44)
	public void test44() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// Sistemski alert: The subtotal field is required.

	}

	// 45 Unos podataka bez unosa rate u stavkama i save
	@Test(priority = 45)
	public void test45() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// assertTrue(toRate)
	}

	// 46 Unos podataka sa discount 110 i save
	@Test(priority = 46)
	public void test46() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("110");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("20");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// assertTrue(toDiscount)
	}

	// 47 Unos podataka sa TAX 100 i save
	@Test(priority = 47)
	public void test47() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("5");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("100");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// System alert
	}

	// 48 Brisanje stavki sa No i save
	@Test(priority = 48)
	public void test48() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDeleteContentInvoices();// delete staf
		newInvPage.toDeleteNoContentInvoices();// delete No staf
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("5");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("20");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija
		// assertTrue(toSave)
	}

	// 49 Brisanje stavki sa Yes i save
	@Test(priority = 49)
	public void test49() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDeleteContentInvoices();// delete staf
		newInvPage.toDeleteYesContentInvoices();// delete Yes staf
		// verifikacija
		// assertTrue(toSave)

	}

	// 50 Unos svih stavki i na kraju Cancel
	@Test(priority = 50)
	public void test50() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("5");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("20");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toCancelNewInvoice();// cancel
		newInvPage.toCancelNoNewInvoice();// cancel NO
		Thread.sleep(4000);
		newInvPage.toCancelNewInvoice();// cancel
		newInvPage.toCancelYesNewInvoice();// cancel YES
		// verifikacija
	}

	// 51 Unos svih podataka i save - srecna putanja
	@Test(priority = 51)
	public void test51() throws InterruptedException {
		busPage = new BusinessPage(driver);
		newInvPage = new NewInvoicePage(driver);
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// // pozivanje metoda
		newInvPage.toEnterTextNewInvoice();// input etxt new invoicess
		newInvPage.fillTextDataNewInvoices("Invoice");
		newInvPage.toSlectClientInvoices();// otvaranje klijenta
		Thread.sleep(2000);
		newInvPage.toToSlect1Client();
		newInvPage.toFromSlectBusinessInvoices();// otvaranje business
		newInvPage.toFromSlectTextBusinessInvoices();
		newInvPage.toBasisInvoices();// input text new invoicess
		newInvPage.fillTextDataBasisInvoices("Invoice");
		newInvPage.tocurrencyInvoices();// input currency NEW CASE
		newInvPage.toCurrencyDinarInvoices();// input currency rsd
		// stavke - staf
		newInvPage.toAddContentInvoices();// add service
		newInvPage.toAddServiceInvoices();// service input
		newInvPage.fillTextServiceInvoices("Service hp laptop");
		newInvPage.toAddNoteInvoices();// note input
		newInvPage.fillTextNoteInvoices("Service hp laptop hdd 500GB");
		newInvPage.toDaysInvoices();// days input
		newInvPage.fillTextDaysInvoices("1");
		newInvPage.toHoursInvoices();// hours input
		newInvPage.fillTextHoursInvoices("1");
		newInvPage.toRateInvoices();// hours input
		newInvPage.fillTextRateInvoices("750");
		newInvPage.toDiscountInvoices();// Discount
		newInvPage.fillDiscountInvoices("5");
		newInvPage.toTaxInvoices();// Tax - porez
		newInvPage.fillTaxInvoices("20");
		newInvPage.toBankInvoices();// select Bank
		newInvPage.toSelectDefaultBankInvoice();// select first Bank
		newInvPage.toSaveNewInvoice();// save CASE
		// verifikacija

	}
}