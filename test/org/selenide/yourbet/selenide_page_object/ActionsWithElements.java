package org.selenide.yourbet.selenide_page_object;

import java.util.Random;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ActionsWithElements extends SearchElements {


    public ActionsWithElements searchLogoPresent() {
        logoPresent.shouldBe(visible);

        return page(ActionsWithElements.class);

    }

    public ActionsWithElements loginMethod() {
        loginButton.exists();
        loginButton.click();
        loginField.exists();
        loginField.setValue("testyb4");
        passwordFiled.exists();
        passwordFiled.setValue("Test2018");
        buttonEnter.exists();
        buttonEnter.pressEnter();
        pinCodeElement.isDisplayed();
        pinCodeElement.shouldHave(text("PIN:76860238"));


        return page(ActionsWithElements.class);

    }

    public ActionsWithElements loginMethodNegative() {
        loginButton.exists();
        loginButton.click();
        loginField.exists();
        loginField.setValue("ydt4");
        passwordFiled.exists();
        passwordFiled.setValue("Test28");
        buttonEnter.exists();
        buttonEnter.pressEnter();
        popupErrorLogin.isDisplayed();

        return page(ActionsWithElements.class);
    }

    public ActionsWithElements checkRegistrationMethod() {

        registrationButton.exists();
        registrationButton.click();
        emailFieldRegForm.exists();
        emailFieldRegForm.setValue(generateString() + "@2odem.com");
        loginRegFormField.exists();
        loginRegFormField.setValue(generateString());
        passwordFiledRegForm.exists();
        passwordFiledRegForm.setValue("Test2018");
        radioButtonEUR.exists();
        radioButtonEUR.click();
        checkBoxAgreeTerms.exists();
        checkBoxAgreeTerms.click();
        registrationButtonInForm.pressEnter();
        activateAccountPopupInfo.shouldBe(visible);

        return page(ActionsWithElements.class);
    }

    public String generateString() {
        String characters = "selenium";
        final Random random = new Random();


        int random_number = random.nextInt(500);
        int random_number_sum = random_number;

       for (int i = 1; i <= 1; i++) {
            random_number_sum = random_number_sum+ i;
        }

       /* String result = "";

        for(int i = 0; i < 10; i++){
            result += String.valueOf(myRandom.nextInt()) + "\n";
        }

        mInfoTextView.setText(result);*/
        String added = String.valueOf(random_number);
        return new String(characters + added);
    }


    public ActionsWithElements profileUpdateMethod() {
        loginMethod();
        profileAvatar.click();
        passwordFiled.clear();
        passwordFiled.setValue("Test2018");
        saveProfileDataButton.waitUntil(enabled, 10000);
        saveProfileDataButton.pressEnter();
        saveProfilePopup.isDisplayed();
        // saveProfilePopup.shouldHave(text("Настройки профіля збережено"));
        return page(ActionsWithElements.class);
    }

    public ActionsWithElements bankCardDepositMethod() {
        loginMethod();
        cashierIcon.click();
        visa_mastercard_RadioButton.click();
        fieldForSumVisaMastercard.setValue("55");
        depositButtonVisaMastercard.pressEnter();
        cardPaySumPresent.shouldHave(exactText("55.00 EUR"));
        inputCardNumberField.setValue("4000000000000002");
        inputCardHolderField.setValue("Kostyantyn Melnyk");
        cardExpiresMonth.click();
        cardExpiresMonth.selectOptionContainingText("09");
        cardExpiresYear.click();
        cardExpiresYear.selectOptionContainingText("2023");
        cvvField.setValue("111");
        payCardSubmitButton.pressEnter();
        successPaymentEmulateButton.waitUntil(visible, 10000);
        successPaymentEmulateButton.pressEnter();
        paymentStatus.shouldHave(exactText("CONFIRMED"));


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

