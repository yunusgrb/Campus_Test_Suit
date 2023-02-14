package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_6 extends Parent {
    public User_6() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setup;

    @FindBy(xpath = "(//a[@target='_self'])[52]")
    private WebElement subjectCategories;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    WebElement myElement;

    public void findAndClick(String strELement) {
        switch (strELement) {

            case "education":  myElement = education; break;
            case "setup": myElement = setup; break;
            case "subjectCategories": myElement = subjectCategories; break;
            case "addButton": myElement = addButton; break;
            case "saveButton": myElement = saveButton; break;


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
            case "codeInput": myElement = codeInput; break;

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
