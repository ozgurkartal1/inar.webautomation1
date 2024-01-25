package utils;

import pages.*;
import pages.accordion.CollapseContentPage;
import pages.alerts.AlertTypesPage;
import pages.autocomplate.AccentFoldingPage;
import pages.checkbox_radio.ProductSelectorTab;
import pages.controlgroup.ToolbarPage;
import pages.datepicker.DisplayMultipleMonthsTab;
import pages.datepicker.SelectDateRangePage;
import pages.dialog.ModalFormPage;
import pages.draggable.AutoScrollingTab;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.DefaultFunctionalityTab;
import pages.draggable.Handless;
import pages.droppable.AcceptPage;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NormalIframePage;
import pages.menu.IconsPage;
import pages.progressbar.DownloadDialogPage;
import pages.resizeable.SynchronusResizePage;
import pages.resizeable.TextAreaPage;
import pages.selectable.SerializePage;
import pages.slider.SnapToIncrementsPage;
import pages.sortable.DisplayAsGridTab;
import pages.sortable.IncludeAndExcludeItemsTab;
import pages.spinner.SpinnerOverflow;

public class Pages {

	public HomePage getHomePage() {
		return new HomePage();
	}

	public WebAutomationPage getWebAutomationPage() {
		return new WebAutomationPage();
	}

	public DefaultFunctionalityTab getDefaultFunctionalityTab() {
		return new DefaultFunctionalityTab();
	}

	public AutoScrollingTab getAutoScrollingTab() {
		return new AutoScrollingTab();
	}

	public ConstrainMovementPage getConstrainMovementPage() {
		return new ConstrainMovementPage();
	}

	public Handless getHandlessPage() {
		return new Handless();
	}

	public AcceptPage getAcceptPage() {
		return new AcceptPage();
	}

	public RevertDraggablePositionPage getRevertDraggablePositionPage() {
		return new RevertDraggablePositionPage();
	}

	public SerializePage getSerializePage() {
		return new SerializePage();
	}

	public AlertTypesPage getAlertsTypePage() {
		return new AlertTypesPage();
	}

	public NormalIframePage getNormalIframePage() {
		return new NormalIframePage();
	}

	public SynchronusResizePage getsynchronusResizePage() {
		return new SynchronusResizePage();
	}

	public TextAreaPage getTextAreaPage() {
		return new TextAreaPage();
	}

	public AccentFoldingPage getAccentFoldingPage() {
		return new AccentFoldingPage();
	}

	public ToolbarPage getToolbarPage() {
		return new ToolbarPage();
	}

	public ModalFormPage getModalFormPage() {
		return new ModalFormPage();
	}

	public DownloadDialogPage getDownloadDialogPage() {
		return new DownloadDialogPage();
	}

	public SelectDateRangePage getSelectDateRangePage(){
		return new SelectDateRangePage();
	}

	public CollapseContentPage getCollapseContentPage(){
		return new CollapseContentPage();
	}
	public IconsPage getIconsPage(){
		return new IconsPage();
	}

	public SnapToIncrementsPage getSnapToIncrementsPage(){
		return new SnapToIncrementsPage();
	}

	public SpinnerOverflow getSpinnerOverflow(){return new SpinnerOverflow();}

	public ProductSelectorTab getProductSelectorTab(){return new ProductSelectorTab();}

	public DisplayAsGridTab getDisplayAsGridTab(){
		return new DisplayAsGridTab();
	}
	public IncludeAndExcludeItemsTab getIncludeAndExcludeItemsTab(){
		return new IncludeAndExcludeItemsTab();
	}

	public DisplayMultipleMonthsTab getDisplayMultipleMonthsTab(){
		return new DisplayMultipleMonthsTab();
	}

}
