package tests;

import org.testng.annotations.Test;
import pages.BordPage;
import pages.BusinessPage;
import pages.LoginPage;
import pages.NewBusinessPage;
import pages.NewInvoicePage;

public class BordTest extends InitTest {
	LoginPage logPage;
	BordPage bordPage;
	NewInvoicePage newInvPage;
	BusinessPage busPage;
	NewBusinessPage newBusPage;

	// 21 Unos podataka za pretragu faktura (client, status, od-do)
	@Test(priority = 21)
	public void test21() throws InterruptedException {
		bordPage = new BordPage(driver);
		logPage = new LoginPage(driver);
		// pozivanje metoda
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// verifikacija
	}

	// 22 Unos podataka za pretragu faktura (client, status, od-do) sa upotrebom
	// period filtera
	@Test(priority = 22)
	public void test22() throws InterruptedException {
		bordPage = new BordPage(driver);
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// vremensko dugme
		bordPage.toPeriodDate();// menja datumska polja
		bordPage.toMonthDate(); // ovaj mesec
		bordPage.toPeriodDate();// menja datumska polja
		bordPage.toLastMonthDate(); // prosli mesec
		// verifikacija
	}

	// 24 Provera Sent statusa fakture (yes or no)
	@Test(priority = 24)
	public void test24() throws InterruptedException {
		bordPage = new BordPage(driver);
		// // pozivanje metoda
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// vremensko dugme
		bordPage.toPeriodDate();// menja datumska polja
		bordPage.toLastMonthDate(); // prosli mesec

		// promena statusa fakture
		bordPage.toChangeStatus(); // promena statusa fakture OLOVKA
		bordPage.toChangeStatusList(); // lista promena statusa fakture
		bordPage.toChangeSentStatusList(); // sent status fakturee
		bordPage.toChangeNoStatus(); // vazeci Status fakture u NO
		bordPage.toChangeSentStatusList(); // sent status fakture
		bordPage.toChangeYesStatus(); // vazeci Status fakture u YES
		// verifikacija
	}

	// 25 Provera Paid statusa fakture (yes or no)
	@Test(priority = 25)
	public void test25() throws InterruptedException {
		bordPage = new BordPage(driver);
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// vremensko dugme
		bordPage.toPeriodDate();// menja datumska polja
		bordPage.toLastMonthDate(); // prosli mesec
		// promena statusa fakture
		bordPage.toChangeStatus(); // promena statusa fakture OLOVKA
		bordPage.toChangeStatusList(); // lista promena statusa fakture
		bordPage.toChangePaidStatusList(); // paid status fakture
		bordPage.toChangeNoStatus(); // vazeci Status fakture u NO
		bordPage.toChangePaidStatusList(); // paid status fakture
		bordPage.toChangeYesStatus(); // vazeci Status fakture u YES
		// verifikacija
	}

	// 26 Provera Invalid statusa fakture (yes or no)
	@Test(priority = 26)
	public void test26() throws InterruptedException {
		bordPage = new BordPage(driver);
		// pozivanje metoda
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// vremensko dugme
		bordPage.toPeriodDate();// menja datumska polja
		bordPage.toLastMonthDate(); // prosli mesec
		// promena statusa fakture
		bordPage.toChangeStatus(); // promena statusa fakture OLOVKA
		bordPage.toChangeStatusList(); // lista promena statusa fakture
		bordPage.toChangeInvalidStatusList(); // invalid status fakture
		bordPage.toChangeNoStatus(); // vazeci Status fakture u NO
		bordPage.toChangeInvalidStatusList(); // invalid status fakture
		bordPage.toChangeYesStatus(); // vazeci Status fakture u YES
		// verifikacija
	}

	// 27 Edit postojece fakture
	@Test(priority = 27)
	public void test27() throws InterruptedException {
		bordPage = new BordPage(driver);
		// pozivanje metoda
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// edit fakture
		bordPage.toEditInv(); // Izmena stanja (edit) 3 tackice
		bordPage.toEditEditInv(); // edit fakture
		bordPage.toEditEditEditInv(); // edit edit fakture
		// verifikacija
	}

	// 28 Preview postojece fakture
	@Test(priority = 28)
	public void test28() throws InterruptedException {
		bordPage = new BordPage(driver);
		// // pozivanje metoda
		bordPage.toSelectClient();
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// edit fakture
		bordPage.toEditInv(); // Izmena stanja (edit) 3 tackice
		bordPage.toEditEditInv(); // edit fakture
		bordPage.toPreviewInv(); // preview fakture
		bordPage.toclosePreviewInv(); // preview close fakture
		// verifikacija
	}

	// 29 Delete postojece fakture
	@Test(priority = 29)
	public void test29() throws InterruptedException {
		bordPage = new BordPage(driver);
		// pozivanje metoda
		bordPage.toSelectClient();
		;
		bordPage.toSelectOneClient();
		bordPage.toSelectSelectStatus();
		bordPage.toSelectOneStatus();
		// ***fromDate
		bordPage.toFromDate();
		bordPage.toMoveFromDateLeft();
		bordPage.toMoveFromDateRight();
		bordPage.toFromAnyTime();
		// ****toDate
		bordPage.toToDate();
		bordPage.toMoveToLeftDate();
		bordPage.toMoveToRightDate();
		bordPage.toToAnyTime();
		// edit fakture
		bordPage.toEditInv(); // Izmena stanja (edit) 3 tackice
		bordPage.toEditEditInv(); // edit fakture
		bordPage.toDeleteInv(); // delete fakture
		bordPage.toDeleteNoInv(); // NO delete fakture
		bordPage.toDeleteInv(); // delete fakture
		bordPage.toDeleteYesInv(); // YES delete fakture
		// verifikacija
	}
}
