package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("Account summary page title is {string}")
    public void account_summary_page_title_is(String expected) {
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expected,actualTitle);
    }

    @Then("Account summary page have to following account types")
    public void account_summary_page_have_to_following_account_types(List<String> accountTypes) {

        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountSummaryPage.accountsTypes);

        Assert.assertEquals(accountTypes, actualAccountTypes);

    }

    @Then("Credit Accounts table have following columns")
    public void credit_Accounts_table_have_following_columns(List<String> expectedColumns) {
        List<String> actualColumns = BrowserUtils.getElementsText(accountSummaryPage.creditAccountsColumns);

        Assert.assertEquals(expectedColumns,actualColumns);

    }



}
