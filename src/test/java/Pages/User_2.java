package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_2 extends Parent{

    public User_2() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setup;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//mat-dialog-actions//button[@type=\"submit\"]")
    private WebElement deleteButton2;

    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "humanResources" : myElement =humanResources; break;
            case "attestations" : myElement =attestations; break;
            case "setup" : myElement =setup; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "editButton" : myElement =editButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteButton2" : myElement =deleteButton2; break;

        }

        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "nameInput" : myElement =nameInput; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "successMessage" : myElement =successMessage; break;
        }

        verifyContainsText(myElement,text);
    }

}
