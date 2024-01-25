package checkbox_radio;

import base_test.Hooks;
import org.testng.annotations.Test;

import java.util.List;

public class ProductSelectorTabTest extends Hooks {

    @Test
    public void testProductSelectorTab(){
        //Navigate to "Product Selector" tab
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnCheckBoxRadioTab();
        pages.getWebAutomationPage().clickOnProductSelectorTab();

        //Select Brand Option
        pages.getProductSelectorTab().selectBrandOption("Brand 2");

        //Select Shape Option
        pages.getProductSelectorTab().selectShapeOption("Pill");

        List<String> styleOptions = List.of(new String[]{"Border", "Background Color"});

        //Select Style Options(Because it is checkbox)
        pages.getProductSelectorTab().selectStyleOption(styleOptions);

        //Verify that the Brand type has changed to "Brand 2"
        softAssert.assertTrue(pages.getProductSelectorTab().isChangedBrandOfPreviewElement("Brand 2"));

        //Verify that the Shape type has changed to "Pill"
        softAssert.assertTrue(pages.getProductSelectorTab().isChangedShapeOfPreviewElement("Pill"));

        //Verify that the "Border" chexkbox is selected
        softAssert.assertTrue(pages.getProductSelectorTab().isSelectedBorderOption());

        //Verify that the "Background color" checkbox is selected
        softAssert.assertTrue(pages.getProductSelectorTab().isSelectedBackgroundColorCheckbox());

        //Verify all
        softAssert.assertAll();
    }
}
