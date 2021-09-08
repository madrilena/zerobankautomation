package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {
    public PayBillsPage () {

        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//*[@id='pay_bills_tab']")
    public WebElement PayBillsTab;

    @FindBy(xpath= "//select[@id='sp_payee']")
    public WebElement payeeDropdownBtn;

    @FindBy(xpath= "//select[@id='sp_account']")
    public WebElement accountDropdownBtn;

    @FindBy(xpath= "//input[@id='sp_amount']")
    public WebElement amountInputBox;

    @FindBy(xpath= "//input[@id='sp_date']")
    public WebElement dateInputBox;

    @FindBy(xpath= "//input[@id='sp_description']")
    public WebElement descriptionInputBox;

    @FindBy(xpath= "//input[@id='pay_saved_payees']")
    public WebElement payBtn;

    @FindBy(xpath= "//span[contains(text(),'The payment was successfully submitted.')]")
    public WebElement paymentMessage;
}
