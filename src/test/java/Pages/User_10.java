package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_10 extends Parent {
    public User_10() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement orderInput;

    @FindBy(xpath = "//span[text()='Next Grade']")
    private WebElement nextGrade;

    @FindBy(xpath = "//*[@id='mat-option-73']")
    private WebElement clickNextGrade;

    @FindBy(xpath = "(//*[@class='mat-button-focus-overlay'])[11]")
    private WebElement clikEditOrDelete;

    @FindBy(xpath = "((//ms-delete-button//button)[11]")
    private WebElement clickDelete;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteButton;

    @FindBy(xpath = "(//ms-edit-button//button)[11]")
    private WebElement clickEdit;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;


    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    WebElement myElement;

    public void findAndClick(String strELement) {
        switch (strELement) {

            case "setup": myElement = setup; break;
            case "parameters":  myElement = parameters; break;
            case "gradeLevels": myElement = gradeLevels; break;
            case "addButton": myElement = addButton; break;
            case "saveButton": myElement = saveButton; break;
            case "nextGrade": myElement = nextGrade; break;
            case "clickNextGrade": myElement = clickNextGrade; break;
            case "clikEditOrDelete": myElement = clikEditOrDelete; break;
            case "clickEdit": myElement = clickEdit; break;

            case "searchButton":  myElement = searchButton; break;
            case "deleteButton": myElement = deleteButton; break;
            case "deleteDialogBtn": myElement = deleteDialogBtn; break;
            case "editButton": myElement = editButton;break;

        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "nameInput": myElement = nameInput; break;
            case "shortNameInput": myElement = shortNameInput; break;
            case "orderInput": myElement = orderInput; break;

            case "searchInput": myElement = searchInput; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void Delete(String strElement) throws InterruptedException {

        findAndSend("searchInput", strElement);
        findAndClick("searchButton");

        waitUntilLoading();


        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }

    public void Edit(String strElement) throws InterruptedException {

        findAndSend("searchInput", strElement);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("editButton");
    }

    public void EditClick(String strElement){


        findAndSend("nameInput",strElement);

    }


}
