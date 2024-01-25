package sortable;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DisplayAsGrirdTabTest extends Hooks {

    private final int indexOfFirst = 3;
    private final int indexOfSecond = 7;

    @Test
    public void testDisplayAsGridTab(){
        //Navigate to "Display As Grid" tab
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnSortableTab();
        pages.getWebAutomationPage().clickOnDisplayAsGridTab();

        //Get list of texts of all sortable elements
        List<String> webelementTexts1 = pages.getDisplayAsGridTab().getTextOfSortableElements();

        //Sort two elements
        pages.getDisplayAsGridTab().sortTwoElements(indexOfFirst, indexOfSecond);

        //Get list of texts of all sortable elements after sort
        List<String> webelementTexts2 = pages.getDisplayAsGridTab().getTextOfSortableElements();

        List<String> textsWithFilter = webelementTexts1.stream().filter(text -> webelementTexts1.indexOf(text) > 0 &&
                text.equalsIgnoreCase(webelementTexts2.get(webelementTexts1.indexOf(text) - 1))).toList();

        //Verify that all elements between two elements are shifted left
        Assert.assertEquals(indexOfSecond - indexOfFirst, textsWithFilter.size());
    }
}
