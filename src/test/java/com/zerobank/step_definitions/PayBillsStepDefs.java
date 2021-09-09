package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayBillsStepDefs {
    PayBillsPage payBillsPage = new PayBillsPage();

    @When("the user clicks Pay Bills tab")
    public void the_user_clicks_Pay_Bills_tab() {
        payBillsPage.PayBillsTab.click();

    }

    @When("the user selects {string} from Payee")
    public void the_user_selects_from_Payee(String expected) {

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(payBillsPage.payeeDropdownBtn));

        Select select = new Select(payBillsPage.payeeDropdownBtn);
        select.selectByVisibleText(expected);

    }

    @When("the users selects {string} from Account")
    public void the_users_selects_from_Account(String expected) {
        Select select = new Select(payBillsPage.accountDropdownBtn);
        select.selectByVisibleText(expected);
    }

    @When("the user enters amount as {string}")
    public void the_user_enters_amount_as(String expected) {

        payBillsPage.amountInputBox.sendKeys(expected);

    }

    @When("the user enters date as {string}")
    public void the_user_enters_date_as(String expected) {

        payBillsPage.dateInputBox.sendKeys(expected);
    }

    @When("the user enters description as {string}")
    public void the_user_enters_description_as(String expected) {
        payBillsPage.descriptionInputBox.sendKeys(expected);

    }

    @When("the user clicks Pay button")
    public void the_user_clicks_Pay_button() {
      payBillsPage.payBtn.click();
    }

    @Then("the successful payment message is shown as {string}")
    public void the_successful_payment_message_is_shown_as(String expected) {

        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(payBillsPage.paymentMessage));

        String actual = payBillsPage.paymentMessage.getText();
        Assert.assertEquals(expected, actual);




    }
}
