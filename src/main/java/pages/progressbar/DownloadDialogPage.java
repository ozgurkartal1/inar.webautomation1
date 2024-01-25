package pages.progressbar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DownloadDialogPage extends BasePage {

	@FindBy(id = "downloadButton-download-dialog")
	private WebElement downloadButton;

	@FindBy(css = "#dialog-container-download-dialog > div")
	private WebElement diologProgressBar;

	@FindBy(xpath = "//button[text()='Cancel Download']")
	private WebElement cancelDownloadButtonOnDialog;

	public void clickOnDownloadButton() {
		downloadButton.click();
	}

	public boolean isDisplayedDiologProgressBar() {
		return !diologProgressBar.getAttribute("style").contains("display: none");
	}

	public void clickOnCancelDownloadButton() {
		cancelDownloadButtonOnDialog.click();
	}

}
