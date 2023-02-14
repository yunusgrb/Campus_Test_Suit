package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_8_Steps {

    LeftNav ln=new LeftNav();

    DialogContent dc=new DialogContent();
    @Given("Navigate to Departments")
    public void navigateToDepartments() {
        ln.findAndClick("setupOne");
        ln.findAndClick("schoolSetup");
        ln.findAndClick("departments");

    }

    @When("Create a Departments name")
    public void createADepartmentsName() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","ATest200");
        dc.findAndSend("codeInput","191");
        dc.findAndClick("saveButton");
    }

    @When("Edit a Departments name")
    public void editADepartmentsName() {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","ATest002");
        dc.findAndSend("codeInput","190");
        dc.findAndClick("saveButton");

    }

    @When("Delete a Departments name")
    public void deleteADepartmentsName() {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");

    }
}
