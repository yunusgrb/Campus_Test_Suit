package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class User_7_Steps extends Parent{
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @Given("Navigate to School Locations")
    public void navigateToSchoolLocations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            ln.findAndClick(listElement.get(i));
        }

    }

    @When("User sending the keys in New Locations")
    public void userSendingTheKeysInNewLocations(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click edit button")
    public void clickEditButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Edit locations")
    public void editLocations(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Delete Locations")
    public void deleteLocations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
}
