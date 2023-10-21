package org.example.pages;

public interface ILocator {
    //Home Page Locator
    String userNameLabelByXpath="//label[text()='Username']";
    String userNameTextBoxByName="username";
    String passwordLabelByXpath="//label[text()='Password']";
    String passwordTextBoxByName="password";
    String loginButtonByXpath="//button[@type='submit']";
    String forgotPasswordLinkByXpath="//p[text()='Forgot your password? ']";
    String iconLinkedInByXpath="//div[@class='orangehrm-login-footer-sm']/child::a[1]";
    String iconFaceBookByXpath="//div[@class='orangehrm-login-footer-sm']/child::a[2]";
    String iconTwitterByXpath="//div[@class='orangehrm-login-footer-sm']/child::a[3]";
    String iconYoutubeByXpath="//div[@class='orangehrm-login-footer-sm']/child::a[4]";
    String errorMessageLabelXpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']";

    String dashboardLabelXpath="//h6[text()='Dashboard']";

}
