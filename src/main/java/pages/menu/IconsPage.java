package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class IconsPage extends BasePage {
    @FindBy(css = "#menu-w-icons > li > div")
    protected List<WebElement> mainIcons;

    @FindBy(css = "#menu-w-icons > li > ul > li > div")
    protected List<WebElement> subIcons;


    public boolean isClickableMainIcon(String icon){
        List<String> iconsText = mainIcons.stream().map(icons -> icons.getText().toLowerCase()).toList();
        System.out.println(iconsText);
        actions.moveToElement(mainIcons.get(iconsText.indexOf(icon))).perform();
        return mainIcons.get(iconsText.indexOf(icon.toLowerCase())).getAttribute("class").contains("ui-state-active");
    }

    public boolean isClickableSubIcon(String mainIcon, String subIcon){
        if(!isClickableMainIcon(mainIcon)){
            return false;
        }
        BrowserUtils.wait(1);

        List<String> subIconsText = subIcons.stream().map(WebElement::getText).toList();
        actions.moveToElement(subIcons.get(subIconsText.indexOf(subIcon))).perform();
        return subIcons.get(subIconsText.indexOf(subIcon)).getAttribute("class").contains("ui-state-active");
    }


}
