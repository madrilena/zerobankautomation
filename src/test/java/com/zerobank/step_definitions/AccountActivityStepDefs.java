package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @When("the user clicks Account Activity tab")
    public void the_user_clicks_Account_Activity_tab() {
        accountActivityPage.accountActivityTab.click();

    }

    @Then("the account dropdown default option is {string}")
    public void the_account_dropdown_default_option_is(String expected) {
        Select select = new Select(accountActivityPage.accountDropdownBtn);
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(expected,actual);

    }

    @When("the user clicks Account dropdown button")
    public void the_user_clicks_Account_dropdown_button() {
       accountActivityPage.accountDropdownBtn.click();
    }

    @Then("the dropdown has following options")
    public void the_dropdown_has_following_options(List<String> expectedElements) {
       Select select = new Select(accountActivityPage.accountDropdownBtn);

       List<WebElement> actualWebElements = select.getOptions();

       List<String> actualElements = BrowserUtils.getElementsText(actualWebElements);

       Assert.assertEquals(expectedElements,actualElements);

    }



}
