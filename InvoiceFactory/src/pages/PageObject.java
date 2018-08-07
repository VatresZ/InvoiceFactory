package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	// Defini�emo public web drajver za rad u web okru�enju
	public WebDriver driver;
	// Defini�emo Wait
	public WebDriverWait wait;

	public PageObject(WebDriver driver) {
		// Definisemo driver ali this.driver jer se radi o drajveru iz Kontruktora a ne
		// iz class PageObject
		this.driver = driver;
		// Definisemo wait
		wait = new WebDriverWait(driver, 10);
		// Inicijalizujemo def. drajver
		PageFactory.initElements(driver, this);
	}
}