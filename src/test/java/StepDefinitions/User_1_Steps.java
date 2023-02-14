package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;

public class User_1_Steps extends Parent {
    DialogContent dc=new DialogContent();

    LeftNav ln=new LeftNav();


    @Given("Navigate to position categories")
    public void navigateToPositionCategories() {
        ln.findAndClick("humanResources");
        ln.findAndClick("setup");
        ln.findAndClick("positionCategories");
    }

    @When("Create position categories")
    public void createPositionCategories() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Metin");
        dc.findAndClick("saveButton");

    }


    @When("Edit user position")
    public void editUserPosition() {

        dc.findAndSend("searchInput","Metin");
        dc.findAndClick("searchButton");
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", "Pascal");
        dc.findAndClick("saveButton");
    }

    @When("Delete user position")
    public void deleteUserPosition() {
        dc.waitVisibleListAllElement(dc.positionCatList);

        dc.findAndSend("searchInput","Pascal");
        dc.findAndClick("searchButton");

        waitUntilLoading();

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
