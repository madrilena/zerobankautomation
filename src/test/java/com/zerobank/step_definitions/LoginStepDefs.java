package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Given("the user is on the loginPage")
    public void the_user_is_on_the_loginPage() {
    String url = ConfigurationReader.get("url");
    Driver.get().get(url);
    }

    @When("the user logins with valid userName and passWord information")
    public void the_user_logins_with_valid_userName_and_passWord_information() {
    String username = ConfigurationReader.get("username");
    String password = ConfigurationReader.get("password");

    loginPage.login(username, password );
    }

    @Then("Account summary page is displayed")
    public void account_summary_page_is_displayed() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(accountSummaryPage.AccountSummary));

        boolean actual = accountSummaryPage.AccountSummary.isDisplayed();

        Assert.assertTrue(actual);

    }

    @When("the user logins with invalid {string} and {string} credentials")
    public void the_user_logins_with_invalid_and_credentials(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("the user should be see error message")
    public void the_user_should_be_see_error_message() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.errorMessage));

        String expected = "Login and/or password are wrong.";
        String actual = loginPage.errorMessage.getText();
        Assert.assertEquals(expected,actual);

    }


}
