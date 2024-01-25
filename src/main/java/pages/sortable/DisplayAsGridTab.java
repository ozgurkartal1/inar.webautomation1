package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayAsGridTab extends BasePage {
    @FindBy(css = "#sortable-disp-as-grid > li")
    private List<WebElement> sortableElements;

    public void sortTwoElements(int indexOfFirst, int indexOfSecond){
        WebElement firstElement = sortableElements.get(indexOfFirst - 1);
        WebElement secondElement = sortableElements.get(indexOfSecond - 1);
        int xOffset = secondElement.getLocation().getX() - firstElement.getLocation().getX();
        int yOffset = secondElement.getLocation().getY() + secondElement.getSize().getHeight() - firstElement.getLocation().getY();
        actions.clickAndHold(firstElement).moveByOffset(xOffset, yOffset).release().perform();
    }

    public List<String> getTextOfSortableElements(){
        return sortableElements.stream().map(WebElement::getText).toList();
    }
}
