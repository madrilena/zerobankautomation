package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage {
    public AccountSummaryPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href='/bank/redirect.html?url=account-summary.html']")
    public WebElement AccountSummary;

    @FindBy(xpath="//h2[@class='board-header'and text()='Cash Accounts']")
    public WebElement CashAccounts;

    @FindBy(xpath="//h2[@class='board-header'and text()='Investment Accounts']")
    public WebElement InvestmentAccounts;

    @FindBy(xpath="//h2[@class='board-header'and text()='Credit Accounts']")
    public WebElement CreditAccounts;

    @FindBy(xpath="//h2[@class='board-header'and text()='Loan Accounts']")
    public WebElement LoanAccounts;

    @FindBy(xpath="//h2[@class='board-header']")
    public List<WebElement> accountsTypes;

    @FindBy(xpath="(//thead)[3]/tr/th")
    public List<WebElement> creditAccountsColumns;
}
