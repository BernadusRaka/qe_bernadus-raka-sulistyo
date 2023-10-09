package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageScenario extends PageObject {

    private By title(){
        return By.id("button_home");
    }
    @Step
    public boolean validateOnHomePage(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       return $(title()).isDisplayed();
    }
}
