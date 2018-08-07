package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BordPage extends PageObject {

	public BordPage(WebDriver driver) {
		super(driver);
	}

	// ************elementi

	@FindBy(className = "invoice-factory-header-title ml-3")
	WebElement invoices;

	@FindBy(xpath = "//*[@id=\"home-page-user\"]")
	WebElement username;

	@FindBy(id = "nav-bar-business")
	WebElement business;

	@FindBy(css = "div#app div.flex.mr-2.ml-4.sm2 > div > div > div.v-input__slot > div > div > div")
	List<WebElement> selectClient;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a")
	WebElement selectOneClient;

	@FindBy(css = "#app > div.application--wrap > main > div > div > div:nth-child(1) > div > div.flex.ml-5.pl-2 > div > div > div:nth-child(2) > div > div > div.v-input__slot > div > div > div")
	WebElement selectStatus;

	@FindBy(css = "#app > div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a")
	WebElement selectOneStatus;

	// *********************************FromDate
	@FindBy(css = "input#filter-from")
	// @FindBy(id= "filter-from")
	WebElement fromDate;

	@FindBy(css = "div#app div.v-date-picker-header > button[type=\"button\"]:nth-child(1) > div > i")
	WebElement fromLeft;

	@FindBy(css = "div#app button[type=\"button\"]:nth-child(3) > div > i")
	WebElement fromRight;

	@FindBy(xpath = "html/body/div[1]/div[1]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[3]/button")
	WebElement selectfromDate;

	@FindBy(css = "button#filter-from-any > div")
	WebElement fromAnyTime;

	@FindBy(css = "button#filter-from-ok > div")
	WebElement selectOKfromDate;

	// ***********************ToDate
	@FindBy(css = "input#filter-to")
	WebElement toDate;

	@FindBy(css = "div#app div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-header > button[type=\"button\"]:nth-child(1) > div > i")
	WebElement toLeft;

	@FindBy(css = "div#app div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-header > button[type=\"button\"]:nth-child(3) > div > i")
	WebElement toRight;

	@FindBy(xpath = "html/body/div[1]/div[17]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/button")
	WebElement selecttoDate;

	@FindBy(css = "button#filter-to-any > div")
	WebElement toAnyTime;

	@FindBy(css = "button#filter-to-ok > div")
	// @FindBy(xpath= "//*[@id=\"filter-to-ok\"]/div")
	WebElement selectOKtoDate;
	// *******************
	@FindBy(id = "filter-period")
	WebElement periodDate;

	@FindBy(css = "button#this-month > div")
	WebElement monthDate;

	@FindBy(css = "button#last-month > div")
	WebElement lastMonthDate;

	@FindBy(css = "button#reset-dates > div")
	WebElement resetDate;

	@FindBy(css = "button#filter-reset i")
	WebElement reset;

	@FindBy(css = "a#add-new-invoice > div")
	// @FindBy(id="add-new-invoice")
	WebElement newInvoice;
	// **************
	@FindBy(css = "div[class*='active'] a[id*='inv-status-btn-2018-QAZ9']")
	WebElement changeStatus;

	@FindBy(css = "button#context-362 i")
	WebElement changeStatusList;

	@FindBy(xpath = "html/body/div[1]/div[12]/div/div/div[1]/a")
	WebElement changeDraftStatusList;

	@FindBy(xpath = "html/body/div[1]/div[16]/div/div/div[3]/button[2]")
	WebElement changeYesStatus;

	@FindBy(xpath = "html/body/div[1]/div[16]/div/div/div[3]/button[1]")
	WebElement changeNoStatus;

	@FindBy(xpath = "html/body/div[1]/div[16]/div/div/div[2]/a")
	WebElement changeSentStatusList;

	@FindBy(xpath = "html/body/div[1]/div[16]/div/div/div[3]/a")
	WebElement changePaidStatusList;

	@FindBy(xpath = "html/body/div[1]/div[16]/div/div/div[4]/a")
	WebElement changeInvalidStatusList;

	@FindBy(xpath = "html/body/div[1]/div[22]/main/div/div/div[2]/div/div[2]/div/div[8]/div/div[2]/div/button")
	WebElement editInv;

	@FindBy(css = "a#context-edit-362 > div")
	WebElement editEditInv;

	@FindBy(xpath = "html/body/div[1]/div[11]/main/div/div/div/div[2]/div[1]/a")
	WebElement cancelEditInv;

	@FindBy(xpath = "html/body/div[1]/div[11]/main/div/div/div/div[2]/div[2]/button")
	WebElement editEditEditInv;

	@FindBy(xpath = "html/body/div[1]/div[11]/main/div/div/div/div[2]/div[3]/div/button")
	WebElement exportPdfditInv;

	@FindBy(xpath = "html/body/div[1]/div[11]/main/div/div/div/div[1]/div/a")
	WebElement backEditInv;

	// ********************//

	@FindBy(css = "a#context-preview-362 > div")
	WebElement previewInv;

	@FindBy(xpath = "html/body/div[1]/div[9]/div/div/nav/div/a/div")
	WebElement closePreviewInv;

	@FindBy(css = "button#context-delete-362 > div")
	WebElement deleteInv;

	@FindBy(xpath = "html/body/div[1]/div[11]/div/div/div[3]/button[2]")
	WebElement deleteYesInv;

	@FindBy(xpath = "html/body/div[1]/div[11]/div/div/div[3]/button[1]")
	WebElement deleteNoInv;

	// *****

	@FindBy(xpath = "html/body/div[1]/div[68]/main/div/div/div[2]/div/div[2]/div/div[8]/div/div[2]/div/button")
	WebElement editInvoices;

	@FindBy(xpath = "html/body/div[1]/div[57]/div/div[3]/a")
	WebElement editInvoicesForm;

	@FindBy(id = "context-preview-272")
	WebElement previewInvoicesForm;

	@FindBy(id = "context-delete-272")
	WebElement deleteInvoicesForm;

	@FindBy(id = "context-264")
	WebElement editInvoicesList;

	@FindBy(id = "navbar-activities")
	WebElement barActivities;

	@FindBy(id = "primary v-btn v-btn--block")
	WebElement showMore;

	@FindBy(id = "navbar-logout-btn")
	WebElement logOut;

	@FindBy(id = "logout-no")
	WebElement noLogOut;

	@FindBy(id = "logut-yes")
	WebElement yesLogOut;

	// **********metode

	// klik na selecet client
	public void toSelectClient() {
		selectClient.get(0).click();
	}

	// klik na selecet client
	public void toSelectOneClient() {
		wait.until(ExpectedConditions.elementToBeClickable(selectOneClient));
		selectOneClient.click();
	}

	// klik na selecet status
	public void toSelectSelectStatus() {
		selectStatus.click();
	}

	public void toSelectOneStatus() {
		wait.until(ExpectedConditions.elementToBeClickable(selectOneStatus));
		selectOneStatus.click();
	}

	// klik na newInvoice
	public void toNewInv() {
		newInvoice.click();
	}

	// klik na changeStatusList
	public void toEditInvoicesList() {
		editInvoicesList.click();
	}

	public void toPeriodDate() {
		periodDate.click();
	}

	public void toMonthDate() {
		monthDate.click();
	}

	public void toLastMonthDate() {
		lastMonthDate.click();
	}

	public void toResetDate() {
		resetDate.click();
	}

	public void toReset() {
		reset.click();
	}

	public void toChangeStatus() {
		changeStatus.click();
	}

	public void toChangeStatusList() {
		changeStatusList.click();
	}

	public void toChangeDraftStatusList() {
		changeDraftStatusList.click();
	}

	public void toChangeYesStatus() {
		changeYesStatus.click();
	}

	public void toChangeNoStatus() {
		changeNoStatus.click();
	}

	public void toChangeSentStatusList() {
		changeSentStatusList.click();
	}

	public void toChangePaidStatusList() {
		changePaidStatusList.click();
	}

	public void toChangeInvalidStatusList() {
		changeInvalidStatusList.click();
	}

	public void toEditInv() {
		editInvoices.click();
	}

	public void toEditEditInv() {
		editInvoicesForm.click();
	}

	public void toPreviewInv() {
		previewInv.click();
	}

	public void toclosePreviewInv() {
		closePreviewInv.click();
	}

	public void toDeleteInv() {
		deleteInv.click();
	}

	public void toDeleteYesInv() {
		deleteYesInv.click();
	}

	public void toDeleteNoInv() {
		deleteNoInv.click();
	}

	public void toCancelEditInv() {
		cancelEditInv.click();
	}

	public void toEditEditEditInv() {
		editEditEditInv.click();
	}

	public void toExportPdfditInv() {
		exportPdfditInv.click();
	}

	public void toBackEditInv() {
		backEditInv.click();
	}

	// **FromDate
	// klik na fromDate
	public void toFromDate() {
		fromDate.click();
	}

	public void toMoveFromDateLeft() {
		fromLeft.click();
	}

	public void toMoveFromDateRight() {
		fromRight.click();
	}

	public void toSelectfromDate() {
		selectfromDate.click();
	}

	public void toFromAnyTime() {
		fromAnyTime.click();
	}

	public void toSelectOKfromDate() {
		selectOKfromDate.click();
	}

	// **ToDate
	// klik na toDate
	public void toToDate() {
		toDate.click();
	}

	public void toMoveToLeftDate() {
		toLeft.click();
	}

	public void toMoveToRightDate() {
		toRight.click();
	}

	public void toToAnyTime() {
		toAnyTime.click();
	}

	public void toSelectToDate() {
		selecttoDate.click();
	}

	public void toSelectOKToDate() {
		selectOKtoDate.click();
	}

	// **********verifikacija
	// metoda verifikacije postojanja elemenata na strani******
	public boolean isLogUser() {
		wait.until(ExpectedConditions.visibilityOf(username));
		return username.isDisplayed();
	}

	public boolean isBusiness() {
		wait.until(ExpectedConditions.visibilityOf(business));
		return business.isDisplayed();
	}

	public boolean isSelectClient() {
		return ((WebElement) selectClient).isDisplayed();
	}

	public boolean isFromDate() {
		return fromDate.isDisplayed();
	}

	public boolean isToDate() {
		return toDate.isDisplayed();
	}

	public boolean isPeriodDate() {
		return periodDate.isDisplayed();
	}

	public boolean isReset() {
		return reset.isDisplayed();
	}

	public boolean isNewInvoice() {
		wait.until(ExpectedConditions.visibilityOf(newInvoice));
		return newInvoice.isDisplayed();
	}

	public boolean isChangeStatus() {
		return changeStatus.isDisplayed();
	}

	public boolean isEditInvoices() {
		return editInvoices.isDisplayed();
	}

	public boolean isBarActivities() {
		return barActivities.isDisplayed();
	}

	public boolean isShowMore() {
		return showMore.isDisplayed();
	}

	public boolean isLogOut() {
		return logOut.isDisplayed();
	}

	public boolean isNoLogOut() {
		return noLogOut.isDisplayed();
	}

	public boolean isYesLogOut() {
		return yesLogOut.isDisplayed();
	}
}