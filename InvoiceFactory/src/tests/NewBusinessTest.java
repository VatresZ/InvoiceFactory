package tests;

import org.testng.annotations.Test;

import pages.BordPage;
import pages.BusinessPage;
import pages.LoginPage;
import pages.NewBusinessPage;
import pages.NewInvoicePage;

public class NewBusinessTest extends InitTest {
	LoginPage logPage;
	BordPage bordPage;
	NewInvoicePage newInvPage;
	BusinessPage busPage;
	NewBusinessPage newBusPage;

	// 81 Klik na save bez unosa podataka (snimi na prazno jedan case)
	@Test(priority = 81)
	public void test81() throws InterruptedException {
		bordPage = new BordPage(driver);
		newInvPage = new NewInvoicePage(driver);
		logPage = new LoginPage(driver);
		newBusPage = new NewBusinessPage(driver);
		// pozivanje metoda
		busPage.toNewBusiness();// Name new bank
		newBusPage.toSaveNewBusiness();// Save newBusiness list
		// **verifikacija**

	}

	// 82 Unos podataka za novi Business and save
	@Test(priority = 82)
	public void test82() throws InterruptedException {
		newBusPage = new NewBusinessPage(driver);
		// pozivanje metoda
		busPage.toNewBusiness();// Name new bank
		newBusPage.toCountryNewBusiness();// Country new bank
		newBusPage.fillDataCountryNewBusiness("Serbia");
		newBusPage.toCityNewBusiness();// City new bank
		newBusPage.fillDataCityNewBusiness("Novi Sad");
		newBusPage.toStreetNewBusiness();// Street new bank
		newBusPage.fillDataStreetNewBusiness("Glavna 158");
		newBusPage.toZipNewBusiness();// Zip code new bank
		newBusPage.fillDataZipNewBusiness("21000");
		newBusPage.toRegNewBusiness();// Key for new bank
		newBusPage.fillDataRegNewBusiness("asd");
		newBusPage.toSaveNewBusiness();// Save newBusiness list
		// **verifikacija**

	}

	// 83 Odlazak na novi Business List i klik na add bez unosa podataka
	@Test(priority = 83)
	public void test83() throws InterruptedException {
		newBusPage = new NewBusinessPage(driver);
		// pozivanje metoda
		busPage.toNewBusiness();// Name new bank
		newBusPage.toBankNewBusiness();// add new bank account
		newBusPage.toAddBankNewDialogBusiness();// Add new bank
		// **verifikacija**

	}

	// 84 Odlazak na novi Business List i klik na cancel
	@Test(priority = 84)
	public void test84() throws InterruptedException {
		newBusPage = new NewBusinessPage(driver);
		// pozivanje metoda
		busPage.toNewBusiness();// Name new bank
		newBusPage.toBankNewBusiness();// add new bank account -ovo moze novi case
		newBusPage.toCancelNewDialogBusiness();// Cancel add new bank
		// **verifikacija**

	}

	// 85 Odlazak na novi Business List i add new bank account pa save
	@Test(priority = 85)
	public void test85() throws InterruptedException {
		newBusPage = new NewBusinessPage(driver);
		// pozivanje metoda
		busPage.toNewBusiness();// Name new bank
		// *****add new bank account
		newBusPage.toBankNewBusiness();// add new bank account -ovo moze novi case
		newBusPage.toNameBankDialogNewBusiness();// unos naziva banke
		newBusPage.fillDataNameBankDialogNewBusiness("Vojvodjanska banka");

		newBusPage.toAccountNewDialogBusiness();// account naziva banke
		newBusPage.fillDataAccountNewDialogBusiness("170-45898-89");

		newBusPage.toSwiftNewDialogBusiness();// swift new bank
		newBusPage.fillDataSwiftNewDialogBusiness("789-45898-888");

		newBusPage.toPaymentNewDialogBusiness();// payment new bank
		newBusPage.fillDataPaymentNewDialogBusiness("Invoice number: 458/2018");

		newBusPage.toCurrencyNewDialogBusiness();// payment new bank
		newBusPage.fillDataCurrencyNewDialogBusiness("Dinar");

		newBusPage.toAddBankNewDialogBusiness();// Add new bank
		// **verifikacija**

	}

	// 86 Odlazak na novi Business i back bez unosa podataka
	@Test(priority = 86)
	public void test86() throws InterruptedException {
		newBusPage = new NewBusinessPage(driver);
		// pozivanje metoda
		busPage.toNewBusiness();// Name new bank
		newBusPage.toCancelNewDialogBusiness();// Cancel add new bank

		// **verifikacija**

	}
}