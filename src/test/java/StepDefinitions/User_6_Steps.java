package StepDefinitions;

import Pages.DialogContent;
import Pages.User_6;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;


public class User_6_Steps {
    DialogContent dc = new DialogContent();

    User_6 user6 = new User_6();

    @And("Click on the element in the User1")
    public void clickOnTheElementInTheUser1(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user6.findAndClick(listElement.get(i));
        }

    }

    @And("Click on the element in the Dialog1")
    public void clickOnTheElementInTheDialog1(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            user6.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content1")
    public void userSendingTheKeysInDialogContent1(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            user6.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }


    @Then("Click delete area1")
    public void clickDeleteArea1(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user6.Delete(listElement.get(i));
        }
    }

    @And("Edit item Name1")
    public void editItemName1(DataTable elements)throws InterruptedException {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user6.EditClick(listElement.get(i));
        }
    }

    @And("search Area1")
    public void searchArea1(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            user6.Edit(listElement.get(i));
        }
    }
}
