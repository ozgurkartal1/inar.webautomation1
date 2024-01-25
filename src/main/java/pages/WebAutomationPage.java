package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;


public class WebAutomationPage extends BasePage {

	@FindBy(linkText = "Accent Folding")
	private WebElement accentFoldingTab;

	@FindBy(linkText = "Accept")
	private WebElement acceptTab;

	@FindBy(linkText = "Accordion")
	private WebElement accordionTab;

	@FindBy(linkText = "Alerts")
	private WebElement alertsTab;

	@FindBy(linkText = "Autocomplete")
	private WebElement autoComplateTag;

	@FindBy(linkText = "Checkbox Radio")
	private WebElement checkboxRadioTab;

	@FindBy(linkText = "Collapse Content")
	private WebElement collapseContentTab;

	@FindBy(linkText = "Constrain Movement")
	private WebElement constrainMovementTab;

	@FindBy(linkText = "Control Group")
	private WebElement controlGroupTab;

	@FindBy(linkText = "Datepicker")
	private WebElement datePickerTab;

	@FindBy(linkText = "Dialog")
	private WebElement dialogTab;

	@FindBy(linkText = "Display as Grid")
	private WebElement displayAsGridTab;

	@FindBy(linkText = "Display Multiple Months")
	private WebElement displayMultipleMonthsTab;

	@FindBy(linkText = "Download Dialog")
	private WebElement downloadDiologTab;

	@FindBy(linkText = "Draggable")
	private WebElement draggableTab;

	@FindBy(linkText = "Droppable")
	private WebElement droppableTab;

	@FindBy(linkText = "Handles")
	private WebElement handlessTab;

	@FindBy(linkText = "Icons")
	private WebElement iconsTab;

	@FindBy(linkText = "Iframe")
	private WebElement iframeTab;

	@FindBy(linkText = "Include / exclude items")
	private WebElement includeAndExculeItemsTab;

	@FindBy(linkText = "Menu")
	private WebElement menuTab;

	@FindBy(linkText = "Modal Form")
	private WebElement modalFormTab;

	@FindBy(linkText = "Normal Iframe")
	private WebElement normalIframeTab;

	@FindBy(linkText = "Product Selector")
	private WebElement productSelectorTab;

	@FindBy(linkText = "Progress Bar")
	private WebElement progressBarTab;

	@FindBy(linkText = "Resizable")
	private WebElement resizableTab;

	@FindBy(linkText = "Revert draggable position")
	private WebElement revertDraggablePositionTab;

	@FindBy(linkText = "Selectable")
	private WebElement selectableTab;

	@FindBy(linkText = "Select Date Range")
	private WebElement selectDateRangeTab;

	@FindBy(linkText = "Serialize")
	private WebElement serailizeTab;

	@FindBy(linkText = "Snap to increments")
	private WebElement snapToIncrementsTab;

	@FindBy(linkText = "Slider")
	private WebElement sliderTab;

	@FindBy(linkText = "Sortable")
	private WebElement sortableTab;

	@FindBy(linkText = "Spinner")
	private WebElement spinnerTab;

	@FindBy(linkText = "Spinner Overflow")
	private WebElement spinnerOverflowTab;

	@FindBy(linkText = "Synchronus Resize")
	private WebElement synchronusResizeTab;

	@FindBy(linkText = "Textarea")
	private WebElement textAreaLink;

	@FindBy(linkText = "Toolbar")
	private WebElement toolbarTab;

	public WebAutomationPage() {
		super();
	}

	public void clickOnDraggableLink() {
		draggableTab.click();
	}

	public void clickOnConstrainMovementLink() {
		constrainMovementTab.click();
	}

	public void clickOnHandlessLink() {
		handlessTab.click();
	}

	public void clickOnAcceptLink() {
		acceptTab.click();
	}

	public void clickOnDroppableLink() {
		droppableTab.click();
	}

	public void clickOnRevertDraggablePositionLink() {
		revertDraggablePositionTab.click();
	}

	public void clickOnSelectableLink() {
		selectableTab.click();
	}

	public void clickOnSerializeLink() {
		serailizeTab.click();
	}

	public void clickOnAlertLink() {
		alertsTab.click();
	}

	public void clickOnIframeLink() {
		iframeTab.click();
	}

	public void clickOnNormalIframeLink() {
		normalIframeTab.click();
	}

	public void clickOnSynchronusResizeLink() {
		synchronusResizeTab.click();
	}

	public void clickOnResizableLink() {
		resizableTab.click();
	}

	public void clickOnTextAreaLink() {
		textAreaLink.click();
	}

	public void clickOnAutoComplatePage() {
		autoComplateTag.click();
	}

	public void clickOnAccentFoldingPage() {
		accentFoldingTab.click();
	}

	public void clickOnControlGroupPage() {
		controlGroupTab.click();
	}

	public void clickOnToolbarPage() {
		toolbarTab.click();
	}

	public void clickOnModalTabPage() {
		modalFormTab.click();
	}

	public void clickOnDialogPage() {
		dialogTab.click();
	}

	public void clickOnProgressBarPage() {
		progressBarTab.click();
	}

	public void clickOnDownloadDiologPage() {
		downloadDiologTab.click();
	}

	public void clickOnDatePickerPage(){
		datePickerTab.click();
	}

	public void clickOnSelectDateRangeTab(){
		selectDateRangeTab.click();
	}

	public void clickOnAccordionTab(){
		accordionTab.click();
	}

	public void clickOnCollapseContentTab(){
		collapseContentTab.click();
	}

	public void clickOnMenuTab(){
		menuTab.click();
	}

	public void clickOnIconsTab(){
		iconsTab.click();
	}

	public void clickOnSliderTab(){
		while(!sliderTab.isDisplayed()){
			BrowserUtils.pageDown();
		}
		sliderTab.click();
	}

	public void clickOnSnapToIncrementsTab(){
		while (!snapToIncrementsTab.isDisplayed()){
			BrowserUtils.pageUp();
		}
		snapToIncrementsTab.click();
	}

	public void clickOnSpinnerTab(){
		while(!spinnerTab.isDisplayed()){
			BrowserUtils.pageDown();
		}
		spinnerTab.click();
	}

	public void clickOnSpinnerOverflowTab(){
		while (!spinnerOverflowTab.isDisplayed()){
			BrowserUtils.pageUp();
		}
		spinnerOverflowTab.click();
	}

	public void clickOnCheckBoxRadioTab(){
		checkboxRadioTab.click();
	}

	public void clickOnProductSelectorTab(){
		productSelectorTab.click();
	}

	public void clickOnSortableTab(){sortableTab.click();}

	public void clickOnDisplayAsGridTab(){displayAsGridTab.click();}

	public void clickOnIncludeAndExcludeItemsTab(){includeAndExculeItemsTab.click();}

	public void clickOnDisplayMultipleMonthsTab(){
		displayMultipleMonthsTab.click();
	}

}
