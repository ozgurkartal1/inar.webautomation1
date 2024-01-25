package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class IncludeAndExcludeItemsTab extends BasePage {
    @FindBy(css = "#sortable-inc-exc-1 > li")
    private List<WebElement> sortableElementsForFirstExample;

    @FindBy(css = "#sortable-inc-exc-2 > li")
    private List<WebElement> sortableElementsForSecondExample;

    @FindBy(id = "hel-sortable")
    private WebElement frame;

    public void sortTwoElemstForFirstExample(String first, String second){
        List<String> nameOfSortableElements = sortableElementsForFirstExample.stream().map(WebElement::getText).toList();
        WebElement firstElement = sortableElementsForFirstExample.get(nameOfSortableElements.indexOf(first));
        WebElement secondElement = sortableElementsForFirstExample.get(nameOfSortableElements.indexOf(second));
        int xOffset = secondElement.getLocation().getX() - firstElement.getLocation().getX();
        int yOffset = secondElement.getLocation().getY() - firstElement.getLocation().getY() + secondElement.getSize().getHeight() / 2;
        actions.clickAndHold(firstElement).moveByOffset(xOffset, yOffset).release().perform();
    }

    public void sortTwoElemstForSecondExample(int index1, int index2){
        WebElement firstElement = sortableElementsForSecondExample.get(index1 - 1);
        WebElement secondElement = sortableElementsForSecondExample.get(index2 - 1);
        int xOffset = secondElement.getLocation().getX() + secondElement.getSize().getWidth() / 2 - firstElement.getLocation().getX();
        int yOffset = secondElement.getLocation().getY() + secondElement.getSize().getHeight() / 2 - firstElement.getLocation().getY();
        actions.clickAndHold(firstElement).moveByOffset(xOffset, yOffset).release().perform();

    }

    public int getXLocationOfElementForFirstExample(String name){
        List<String> nameOfSortableElements = sortableElementsForFirstExample.stream().map(WebElement::getText).toList();
        return sortableElementsForFirstExample.get(nameOfSortableElements.indexOf(name)).getLocation().getX();
    }

    public int getYLocationOfElementForFirstExample(String name){
        List<String> nameOfSortableElements = sortableElementsForFirstExample.stream().map(WebElement::getText).toList();
        return sortableElementsForFirstExample.get(nameOfSortableElements.indexOf(name)).getLocation().getY();
    }

    public int getXLocationOfElementForSecondExample(int index){
        return sortableElementsForSecondExample.get(index - 1).getLocation().getX();
    }

    public int getYLocationOfElementForSecondExample(int index){
        return sortableElementsForSecondExample.get(index - 1).getLocation().getY();
    }

}
