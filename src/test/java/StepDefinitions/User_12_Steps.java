package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class User_12_Steps {

    LeftNav ln = new LeftNav();
    @And("Click on the element in the User funcitoanality")
    public void clickOnTheElementInTheUserFuncitoanality(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ln.findAndClick(listElement.get(i));
        }


    }
}
