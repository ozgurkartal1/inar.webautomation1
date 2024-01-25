package sortable;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class IncludeAndExcludeItemsTabTest extends Hooks {

    @Test
    public void testFirstPartOfIncludeAndExcludeItemsTab(){
        //Navigate to "Include/ExcludeItems" tab;
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnSortableTab();
        pages.getWebAutomationPage().clickOnIncludeAndExcludeItemsTab();

        int initialX = pages.getIncludeAndExcludeItemsTab().getXLocationOfElementForFirstExample("(I'm not sortable or a drop target)");
        int initialY = pages.getIncludeAndExcludeItemsTab().getYLocationOfElementForFirstExample("(I'm not sortable or a drop target)");

        //Sort two elements which are one of these is sortable and droppable and other is not sortable and is not droppable
        pages.getIncludeAndExcludeItemsTab().sortTwoElemstForFirstExample("Item 1", "(I'm not sortable or a drop target)");

        int finalX = pages.getIncludeAndExcludeItemsTab().getXLocationOfElementForFirstExample("(I'm not sortable or a drop target)");
        int finalY = pages.getIncludeAndExcludeItemsTab().getYLocationOfElementForFirstExample("(I'm not sortable or a drop target)");

        //Verify that the non-sortable and non-droppable element has not been relocated
        Assert.assertEquals(initialX, finalX);
        Assert.assertEquals(initialY, finalY);

        //Get initial location of "Item 4"
        initialX = pages.getIncludeAndExcludeItemsTab().getXLocationOfElementForFirstExample("Item 4");
        initialY = pages.getIncludeAndExcludeItemsTab().getYLocationOfElementForFirstExample("Item 4");

        //Sort two elements which are "Item 1" and "Item 4"
        pages.getIncludeAndExcludeItemsTab().sortTwoElemstForFirstExample("Item 1", "Item 4");
        BrowserUtils.wait(2);

        //Get final location of "Item 1"
        finalX = pages.getIncludeAndExcludeItemsTab().getXLocationOfElementForFirstExample("Item 1");
        finalY = pages.getIncludeAndExcludeItemsTab().getYLocationOfElementForFirstExample("Item 1");

        //Verify that the last location of item 1 is the same as the first location of item 4
        Assert.assertEquals(initialX, finalX);
        Assert.assertEquals(initialY, finalY);

    }

    @Test
    public void testSecondPartOfIncludeAndExcludeItemsTab(){

    }
}
