package pages.checkbox_radio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ProductSelectorTab extends BasePage {

    @FindBy(css = ".brand-options > label")
    private List<WebElement> optionsOfBrands;

    @FindBy(css = ".shape-options > label")
    private List<WebElement> optionsOfShapes;

    @FindBy(css = ".toggle-options > label")
    private List<WebElement> optionsOfStyles;

    @FindBy(css = ".preview > div")
    private WebElement previewElement;

    @FindBy(css = ".preview > div > p")
    private WebElement previewElementText;

    public void selectBrandOption(String option){
        List<String> textOfOptions = optionsOfBrands.stream().map(WebElement::getText).toList();
        optionsOfBrands.get(textOfOptions.indexOf(option)).click();
    }

    public void selectShapeOption(String option){
        List<String> textOfOptions = optionsOfShapes.stream().map(WebElement::getText).toList();
        optionsOfShapes.get(textOfOptions.indexOf(option)).click();
    }

    public void selectStyleOption(List<String> options){
        List<String> textOfOptions = optionsOfStyles.stream().map(WebElement::getText).toList();
        options.forEach(option -> {
            optionsOfStyles.get(textOfOptions.indexOf(option)).click();
        });
    }

    public boolean isSelectedBackgroundColorCheckbox(){
        return previewElement.getAttribute("class").contains("background-color");
    }

    public boolean isChangedBrandOfPreviewElement(String brandOption){
        return previewElementText.getText().equalsIgnoreCase(brandOption);
    }

    public boolean isChangedShapeOfPreviewElement(String shapeOption){
        return previewElement.getAttribute("class").contains(shapeOption.toLowerCase());
    }

    public boolean isSelectedBorderOption(){
        return previewElement.getAttribute("class").contains("border");
    }

}
