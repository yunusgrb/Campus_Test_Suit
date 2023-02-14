package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;
    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;
    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;
    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestation;

    @FindBy(xpath = "(//div/fuse-nav-vertical-collapsable)[3]")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccount;



    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setup": myElement = setup;break;
            case "positions": myElement = positions;break;
            case "humanResources": myElement = humanResources;break;
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExamsOne" : myElement =entranceExamsOne; break;
            case "setupTwo" : myElement =setupTwo; break;
            case "entranceExamsTwo" : myElement =entranceExamsTwo; break;
            case "fields" : myElement =fields; break;
            case "discounts" : myElement =discounts; break;
            case "documentType" : myElement=documentType;break;
            case "positionCategories": myElement=positionCategories;break;
            case "attestation": myElement=attestation;break;
            case "schoolSetup": myElement=schoolSetup;break;
            case "departments": myElement=departments;break;
            case "bankAccount": myElement=bankAccount;break;



        }

        clickFunction(myElement);
    }

}
