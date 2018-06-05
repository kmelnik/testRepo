package org.selenide.yourbet.selenide_page_object;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ActionsWithElements extends SearchElements {

    public ActionsWithElements noteOfChangePrivacyPolicy() {
        titleNotificationPrivacyPolicy.shouldHave(text("Note of change of the Privacy policy"));
        agreeButtonPrivacyPolicy.shouldBe(enabled).click();
        return page(ActionsWithElements.class);
    }

    public ActionsWithElements searchLogoPresent() {

        logoPresent.shouldBe(visible);

        return page(ActionsWithElements.class);

    }

    public ActionsWithElements loginMethod() {
        loginButton.exists();
        loginButton.click();
        loginField.exists();
        loginField.setValue(getTestProperty("positive_login1"));
        passwordFiled.exists();
        passwordFiled.setValue(getTestProperty("positive_password1"));
        buttonEnter.exists();
        buttonEnter.pressEnter();
        authNickNameElement.shouldHave(text(getTestProperty("auth_User_Nickname")));


        return page(ActionsWithElements.class);

    }

    public ActionsWithElements loginMethodNegative() {
        loginButton.exists();
        loginButton.click();
        loginField.exists();
        loginField.setValue(getTestProperty("negative_login1"));
        passwordFiled.exists();
        passwordFiled.setValue(getTestProperty("negative_password1"));
        buttonEnter.exists();
        buttonEnter.pressEnter();
        popupErrorLogin.isDisplayed();

        return page(ActionsWithElements.class);
    }

    public ActionsWithElements checkRegistrationMethod() {

        registrationButton.exists();
        registrationButton.click();
        emailFieldRegForm.exists();
        emailFieldRegForm.setValue(partOfEmail + getTestProperty("domain_email"));
        radioButtonEUR.exists();
        radioButtonEUR.click();
        checkBoxAgreeTerms.exists();
        checkBoxAgreeTerms.click();
        registrationButtonInForm.pressEnter();
        cashProfileBlock.shouldBe(visible);

        return page(ActionsWithElements.class);
    }

    public ActionsWithElements confirmEmailinProfile() {
        checkRegistrationMethod();
        personalInfoBlock.click();
        emailCondirmButtonInProfile.click();

        return page(ActionsWithElements.class);
    }

    int length = 3;
    String partOfEmail = getTestProperty("part_of_email_1") + RandomStringUtils.randomNumeric(length);

    public static String generateString() {
        final Random random = new Random();
        String name = getTestProperty("part_of_login_1");
        String data = String.valueOf(random.nextInt(1000));
        String result = String.valueOf(data);
        return name + result;


    }


    public ActionsWithElements profileUpdateMethod() {
        loginMethod();
        authNickNameElement.click();
        passwordFiled.clear();
        passwordFiled.setValue(getTestProperty("positive_password1"));
        saveProfileDataButton.waitUntil(enabled, 10000);
        saveProfileDataButton.pressEnter();
        saveProfilePopup.isDisplayed();
        saveProfilePopup.shouldHave(text("Profile saved"));
        return page(ActionsWithElements.class);
    }

    public ActionsWithElements bankCardDepositMethod() {
        loginMethod();
        authNickNameElement.click();
       // cashierIcon.click();
        // visa_mastercard_RadioButton.click();
        cashierInternalButtonInProfile.click();
        fieldForSumVisaMastercard.setValue(getTestProperty("sum_in_field_BankCard"));
        depositButtonVisaMastercard.pressEnter();
        cardPaySumPresent.shouldHave(exactText("55.00"));
        inputCardNumberField.setValue(getTestProperty("test_BankCard_number"));
        inputCardHolderField.setValue(getTestProperty("test_cardHolder_name"));
        cardExpiresMonth.click();
        cardExpiresMonth.selectOptionContainingText(getTestProperty("card_Expires_Month"));
        cardExpiresYear.click();
        cardExpiresYear.selectOptionContainingText(getTestProperty("card_Expires_Year"));
        cvvField.setValue(getTestProperty("cvv_data_test"));
        payCardSubmitButton.pressEnter();
        successPaymentEmulateButton.waitUntil(visible, 10000);
        successPaymentEmulateButton.pressEnter();
        paymentStatus.shouldHave(exactText("Success"));


        return page(ActionsWithElements.class);
    }

    public ActionsWithElements promoPageIsPresentWithBonuses() {
        // linkPromoPage.scrollTo();
        linkPromoPage.click();
        welcomeBonusPage.shouldBe(visible);
        bonus555Page.shouldBe(visible);
        freespinsBonusPage.shouldBe(visible);
        megaBonusPage.shouldBe(visible);


        return page(ActionsWithElements.class);
    }


}

