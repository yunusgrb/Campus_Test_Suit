package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _02_DatatableSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    FormContent fc=new FormContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {

           ln.findAndClick(listElement.get(i));
        }

    }




    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++)
        {
            fc.findAndClick(listElement.get(i));
        }
    }
}
