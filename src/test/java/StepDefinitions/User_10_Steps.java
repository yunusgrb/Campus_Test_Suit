package StepDefinitions;

import Pages.DialogContent;
import Pages.User_10;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;


public class User_10_Steps {
    DialogContent dc = new DialogContent();

    User_10 user10 = new User_10();

    @And("Click on the element in the User2")
    public void clickOnTheElementInTheUser2(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user10.findAndClick(listElement.get(i));
        }

    }

    @And("Click on the element in the Dialog2")
    public void clickOnTheElementInTheDialog2(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user10.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content2")
    public void userSendingTheKeysInDialogContent2(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            user10.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }


    @Then("Click delete area2")
    public void clickDeleteArea2(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user10.Delete(listElement.get(i));
        }
    }

    @And("Edit item Name2")
    public void editItemName2(DataTable elements)throws InterruptedException {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user10.EditClick(listElement.get(i));
        }
    }

    @And("search Area2")
    public void searchArea2(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user10.Edit(listElement.get(i));
        }
    }
}
