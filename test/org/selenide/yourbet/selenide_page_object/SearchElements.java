package org.selenide.yourbet.selenide_page_object;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.selenide.yourbet.configProperties.DataConfig;

import static com.codeborne.selenide.Selenide.$$;

public class SearchElements extends DataConfig {
    @FindBy (xpath = "//*[text()='Note of change of the Privacy policy']")
    public SelenideElement titleNotificationPrivacyPolicy;
    @FindBy (xpath = "//a[text()='I agree']")
    public SelenideElement agreeButtonPrivacyPolicy;
    @FindBy(css = "#applicationContainer img")
    public SelenideElement logoPresent;
    @FindBy(xpath = "//*[@id=\"applicationContainer\"]/div/div/div[1]/div/div/div[3]/div[4]/div/div[2]/div")
    public SelenideElement loginButton;
    @FindBy(name = "email")
    public SelenideElement loginField;
    @FindBy(name = "password")
    public SelenideElement passwordFiled;
    @FindBy(tagName = "button")
    public SelenideElement buttonEnter;
    @FindBy(xpath = "//*[@id=\"applicationContainer\"]/div/div/div[1]/div/div/div[3]/div[3]/div/div[1]/div[2]/div[1]/a/div")
    public SelenideElement authNickNameElement;
    @FindBy (xpath = "//a[@class='label ng-isolate-scope']")
    public SelenideElement cashierInternalButtonInProfile;
    @FindBy(className = "error-popup")
    public SelenideElement popupErrorLogin;
    @FindBy(xpath = "//*[@id=\"applicationContainer\"]/div/div/div[1]/div/div/div[3]/div[4]/div/div[1]/div")
    public SelenideElement registrationButton;
    @FindBy(name = "email")
    public SelenideElement emailFieldRegForm;
    @FindBy(name = "login")
    public SelenideElement loginRegFormField;
    @FindBy(name = "password")
    public SelenideElement passwordFiledRegForm;
    @FindBy(css = "#register > div > div.column-1.input-wrap > form > div.footer-bottom_wrap.column-1 > div.footer-bottom > div.currency-wrapper.p-b_17 > div:nth-child(2) > label")
    public SelenideElement radioButtonEUR;
    @FindBy(css = "#register > div > div.column-1.input-wrap > form > div.footer-bottom_wrap.column-1 > div.footer-bottom > div.checkbox-wrapper > div > label")
    public SelenideElement checkBoxAgreeTerms;
    @FindBy(xpath = "//*[@id=\"register\"]/div/div[2]/form/div[2]/div[1]/input")
    public SelenideElement registrationButtonInForm;
    @FindBy (className = "profile-block")
    public SelenideElement cashProfileBlock;
    @FindBy (className = "personal")
    public SelenideElement personalInfoBlock;
    @FindBy (xpath = "/html/body/div[7]/div/div/div/div[2]/div[2]/div/form/div/div/div[4]/div/div[3]/div")
    public SelenideElement emailCondirmButtonInProfile;
    @FindBy(xpath = "//*[@id=\"applicationContainer\"]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div/div[1]/div[1]/img")
    public SelenideElement profileAvatar;
    @FindBy(xpath = "/html/body/div[6]/div/div/div/div[2]/div[2]/div/form/div/div/div[4]/div/div[4]/div/input")
    public SelenideElement saveProfileDataButton;
    @FindBy(className = "gap")
    public SelenideElement saveProfilePopup;
    @FindBy(xpath = "//*[@id=\"applicationContainer\"]/div/div/div[1]/div/div/div[3]/div[3]/div")
    public SelenideElement cashierIcon;
    @FindBy(xpath = "/html/body/div[6]/div/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div[1]")
    public SelenideElement visa_mastercard_RadioButton;
    @FindBy(id = "profile-deposit-amount")
    public SelenideElement fieldForSumVisaMastercard;
    @FindBy(id = "profile-process-deposit")
    public SelenideElement depositButtonVisaMastercard;
    @FindBy(id="total-amount")
    public SelenideElement cardPaySumPresent;
    @FindBy(id = "input-card-number")
    public SelenideElement inputCardNumberField;
    @FindBy(id = "input-card-holder")
    public SelenideElement inputCardHolderField;
    @FindBy(id = "card-expires-month")
    public SelenideElement cardExpiresMonth;
    @FindBy(id = "card-expires-year")
    public SelenideElement cardExpiresYear;
    @FindBy(id = "input-card-cvc")
    public SelenideElement cvvField;
    @FindBy(id = "action-submit")
    public SelenideElement payCardSubmitButton;
    @FindBy(id = "success")
    public SelenideElement successPaymentEmulateButton;
    @FindBy(id = "payment-status-title")
    public SelenideElement paymentStatus;
    @FindBy (xpath = "//*//a[@href='/en/promotions']")
    public SelenideElement linkPromoPage;
    @FindBy(xpath = "//*[@id=\"applicationContainer\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div[1]/img")
    public SelenideElement welcomeBonusPage;
    @FindBy(css = "#applicationContainer > div > div > div.container.ng-scope > div > div > div.content.promos-content > div > div:nth-child(2) > div.promo-item__cover > img")
    public SelenideElement bonus555Page;
    @FindBy (css = "#applicationContainer > div > div > div.container.ng-scope > div > div > div.content.promos-content > div > div:nth-child(3) > div.promo-item__cover > img")
    public SelenideElement freespinsBonusPage;
    @FindBy (css = "#applicationContainer > div > div > div.container.ng-scope > div > div > div.content.promos-content > div > div:nth-child(4) > div.promo-item__cover > img")
    public SelenideElement megaBonusPage;









}

