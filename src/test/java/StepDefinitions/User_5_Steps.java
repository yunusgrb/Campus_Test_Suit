package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;


public class User_5_Steps {
    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @And("Click on the element in the User")
    public void clickOnTheElementInTheUser(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            ln.findAndClick(listElement.get(i));
        }

    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }


    @Then("Click delete area")
    public void clickDeleteArea(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }

    @And("Edit item Name")
    public void editItemName(DataTable elements)throws InterruptedException {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.EditClick(listElement.get(i));
        }
    }

    @And("search Area")
    public void searchArea(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.Edit(listElement.get(i));
        }
    }
}
