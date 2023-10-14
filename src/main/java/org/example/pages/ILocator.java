package org.example.pages;

public interface ILocator {
    //Home Page Locator
    String userNameLabelByXpath="//label[text()='Username']";
    String userNameTextBoxByName="username";
    String passwordLabelByXpath="//label[text()='Password']";
    String passwordTextBoxByName="password";
    String loginButtonByXpath="//button[@type='submit']";
    String forgotPasswordLinkByXpath="//p[text()='Forgot your password? ']";
}
