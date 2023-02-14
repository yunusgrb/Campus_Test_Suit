package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class User_3_Steps extends Parent {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent fc =new FormContent();

    Robot rbt = new Robot();

    public User_3_Steps() throws AWTException {
    }

    @Given("Navigate to documents type")
    public void navigateToDocumentsType() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("documentType");
    }

    @When("Create documents type")
    public void createDocumentsType() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","kamil");
        fc.findAndClick("stage");
        fc.findAndClick("stageSelect");
        rbt.keyPress(KeyEvent.VK_ESCAPE);
        rbt.keyRelease(KeyEvent.VK_ESCAPE);
        dc.findAndClick("saveButton");
    }

    @When("edit documents type")
    public void editDocumentsType() {
        dc.findAndSend("editNameInput","kamil");
        dc.findAndClick("editStage");
        dc.findAndClick("stageSelect2");
        dc.findAndClick("searchButton");



        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","papara");
        dc.findAndClick("saveButton");
    }

    @When("delete documents type")
    public void deleteDocumentsType() {
        dc.findAndSend("editNameInput","papara");
        dc.findAndClick("editStage");
        dc.findAndClick("stageSelect2");
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
