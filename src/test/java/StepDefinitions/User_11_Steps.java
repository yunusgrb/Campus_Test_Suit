package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class User_11_Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Discounts Page")
    public void navigateToDiscountsPage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Create a Discounts")
    public void createADiscounts(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }


    @And("Edit and Delete Discounts")
    public void editAndDeleteDiscounts(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
// dc.findAndClick("addButton");
//        dc.findAndSend("description","EnginUser11");
//        dc.findAndSend("integrationCode","171717");
//        dc.findAndSend("priorityCode","10");
//        dc.findAndClick("saveButton");