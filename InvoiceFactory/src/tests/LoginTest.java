package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.BordPage;
import pages.BusinessPage;
import pages.NewBusinessPage;
import pages.NewInvoicePage;
import pages.LoginPage;

public class LoginTest extends InitTest {
	LoginPage logPage;
	BordPage bordPage;
	NewInvoicePage newInvPage;
	BusinessPage busPage;
	NewBusinessPage newBusPage;

	// 1.Klik na Login bez unosa email i pass
	@Test(priority = 0)
	public void test1() {
		driver.get("http://app.invoice-factory.source-code.rs");
		logPage = new LoginPage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isAt());
		logPage.fillData("", "");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isEmailMsgPresent());
		assertTrue(logPage.isPassMsgPresent());
	}

	// 2.Unos ispravnog Email bez unosa Passworda
	@Test(priority = 1)
	public void test2() throws InterruptedException {
		logPage = new LoginPage(driver);

		logPage.fillData("test@gmail.com", "");
		logPage.logIn();
		// verifikacija sistemski alert
		assertTrue(logPage.isPassMsgPresent());
	}

	// 3.Unos ispravnog Passworda bez unosa Email
	@Test(priority = 2)
	public void test3() throws InterruptedException {
		logPage = new LoginPage(driver);
		logPage.fillData("", "qwe123");
		logPage.logIn();
		// verifikacija sistemski alert
		assertTrue(logPage.isEmailMsgPresent());
	}

	// 4.Unos cirilice za Email
	@Test(priority = 3)
	public void test4() {
		logPage = new LoginPage(driver);
		logPage.fillData("тест@гмаил.цом", "qwe123");
		logPage.logIn();
		// verifikacija sistemski alert

	}

	// 5.Unos cirilice za Password
	@Test(priority = 4)
	public void test5() {
		logPage = new LoginPage(driver);
		logPage.fillData("test@gmail.com", "љве123");
		logPage.logIn();
		// verifikacija sistemski alert

	}

	// 6.Unos samo Emaila sa greskom pri unosu (izostavljanje slova m)
	@Test(priority = 5)
	public void test6() throws InterruptedException {
		logPage = new LoginPage(driver);
		logPage.fillData("test@gmail.co", "");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isPassMsgPresent());
	}

	// 7.Unos samo Password sa greskom pri unosu (izostavljanje brojeva 23)
	@Test(priority = 6)
	public void test7() {
		logPage = new LoginPage(driver);
		logPage.fillData("test@gmail.com", "qwe1");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isPassMsgPresent());
	}

	// 8.Unos Grckih slova za Email. Password ispravan.
	@Test(priority = 7)
	public void test8() {
		logPage = new LoginPage(driver);
		logPage.fillData("τεστ@γμαιλ.ψομ", "qwe123");
		logPage.logIn();
		// verifikacija sistemski alert
	}

	// 9.Unos Grckih slova za Password, Email ispravan.
	@Test(priority = 8)
	public void test9() {
		logPage = new LoginPage(driver);
		logPage.fillData("test@gmail.com", ";ςε123");
		logPage.logIn();
		// verifikacija sistemski alert

	}

	// 10.Unos Arapskih slova za Email. Password ispravan.
	@Test(priority = 9)
	public void test10() {
		logPage = new LoginPage(driver);
		logPage.fillData("ئفثسف@لةشهمزؤخة", "qwe123");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isEmailMsgPresent());
	}

	// 11.Unos Arapskih slova za Password, Email ispravan.
	@Test(priority = 10)
	public void test11() {
		logPage = new LoginPage(driver);
		logPage.fillData("test@gmail.com", "ضصث123");
		logPage.logIn();
		// verifikacija sistemski alert

	}

	// 12.Korektan unosa Email i Password
	// srecna putanja logovanja
	@Test(priority = 11)
	public void test12() {
		logPage = new LoginPage(driver);
		bordPage = new BordPage(driver);
		logPage.fillData("test@gmail.com", "qwe123");
		logPage.logIn();

		// verifikacija uspesnog logovanja sa BordPage uzeta verifikacija log user-a
		assertTrue(bordPage.isLogUser());
		
	}
}