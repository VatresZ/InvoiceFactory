package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// ***elementi

	@FindBy(id = "login-form-email")
	WebElement email;
	@FindBy(id = "login-pass")
	WebElement password;
	@FindBy(className = "v-btn__content")
	WebElement signIn;
	@FindBy(className = "v-messages__message")
	List<WebElement> invalidMsgs;

	// ***metoda koja definise sta se radi nad elementima
	public void fillData(String user, String pass) {
		email.clear();
		email.sendKeys(user);

		password.clear();
		password.sendKeys(pass);
	}

	public void logIn() {
		signIn.click();
	}

	// ***verifikacija
	// metoda verifikacije postojanja email, password i Login-a
	public boolean isEmail() {
		wait.until(ExpectedConditions.visibilityOf(email));
		return email.isDisplayed();
	}

	public boolean isPass() {
		wait.until(ExpectedConditions.visibilityOf(password));
		return password.isDisplayed();
	}

	public boolean isAt() {
		wait.until(ExpectedConditions.visibilityOf(signIn));
		return signIn.isDisplayed();
	}
	// ****************

	// metoda verifikacije neispravan Email -The email field is required.
	public boolean isEmailMsgPresent() {
		wait.until(ExpectedConditions.visibilityOf(invalidMsgs.get(0)));
		System.out.println(invalidMsgs.get(0).getText());
		return invalidMsgs.get(0).isDisplayed();
	}

	// metoda verifikacije neispravan Password - The password field is required
	public boolean isPassMsgPresent() {
		wait.until(ExpectedConditions.visibilityOf(invalidMsgs.get(1)));
		return invalidMsgs.get(1).isDisplayed();
	}

}
