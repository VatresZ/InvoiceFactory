package tests;

import org.testng.annotations.Test;
import pages.BordPage;
import pages.BusinessPage;
import pages.LoginPage;
import pages.NewBusinessPage;
import pages.NewInvoicePage;

public class BusinessTest extends InitTest {
	LoginPage logPage;
	BordPage bordPage;
	NewInvoicePage newInvPage;
	BusinessPage busPage;
	NewBusinessPage newBusPage;

	// 61 Open Details business and edit rsd account
	@Test(priority = 61)
	public void goToTest61() throws InterruptedException {
		busPage = new BusinessPage(driver);
		busPage.toDetailsBusiness();// open Details business
		busPage.toEditBusiness();// edit Details business
		busPage.toRSDAccount();// edit rsd Account
		busPage.toEditccount();// edit all Account
		busPage.toDeleteccount();// delete all Account
	}

	// 62 Open Details business and edit euro account
	@Test(priority = 62)
	public void goToTest62() throws InterruptedException {
		busPage = new BusinessPage(driver);
		busPage.toDetailsBusiness();// open Details business
		busPage.toEditBusiness();// edit Details business
		busPage.toEUROAccount();// edit euro Account
		busPage.toEditccount();// edit all Account
		busPage.toDeleteccount();// delete all Account
	}

	// 63 Open Details business and delete No account
	@Test(priority = 63)
	public void goToTest63() throws InterruptedException {
		busPage = new BusinessPage(driver);
		busPage.toDetailsBusiness();// open Details business
		busPage.toEditBusiness();// edit Details business
		busPage.toDeleteccount();// delete all Account
		busPage.toDeleteNoAccount();// delete no
	}

	// 64 Open Details business and delete Yes account
	@Test(priority = 64)
	public void goToTest64() throws InterruptedException {
		busPage = new BusinessPage(driver);
		busPage.toDetailsBusiness();// open Details business
		busPage.toEditBusiness();// edit Details business
		busPage.toDeleteccount();// delete all Account
		busPage.toDeleteYesAccount();// delete yes
	}

	// 65 Open Details business and Back to Business List
	@Test(priority = 65)
	public void goToTest65() throws InterruptedException {
		busPage = new BusinessPage(driver);
		busPage.toDetailsBusiness();// open Details business
		busPage.toEditBusiness();// edit Details business
		busPage.toBackToBusiness();// back to business list

	}

}
