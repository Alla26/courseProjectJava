package ru.netology.courseProjectJava.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class PurchasePage {
    private SelenideElement buyButton = $x("//span[text()=\"Оплата по карте\"]");   //кнопка Купить
    private SelenideElement paymentMethod = $x("//h3[text()=\"Оплата по карте\"]");    // Метод покупки (оплата картой)
    private SelenideElement continueButton = $("button[class=\"button button_view_extra button_size_m button_theme_alfa-on-white\"]");  //Кнопка Продолжить
    private SelenideElement cardNumberField = $("[placeholder=\"0000 0000 0000 0000\"]");    // Поле номер карты
    private SelenideElement cardNumberFieldError = $x("//div[@class=\"form-field form-field_size_m form-field_theme_alfa-on-white\"]//span[@class='input__sub']");    // Сообщение об ошибке карта
    private SelenideElement monthField = $("[placeholder=\"08\"]");    // Поле месяц
    private SelenideElement monthFieldError = $x("//span[text()=\"Месяц\"]//span[@class='input__sub']");    // Сообщение об ошибке месяц
    private SelenideElement yearField = $("[placeholder=\"22\"]");    // Поле год
    private SelenideElement yearFieldError = $x("//span[text()='Год']//span[@class='input__sub']");    // Сообщение об ошибке год
    private SelenideElement ownerField = $x("//span[text()=\"Владелец\"]");    // Поле владелец
    private SelenideElement ownerFieldError = $x("//span[text()=\"Владелец\"]//[@class='input__sub']");    // Сообщение об ошибке владелец
    private SelenideElement cvvField = $("[placeholder=\"999\"]");    // Поле cvc/cvv
    private SelenideElement cvvFieldError = $("//span[text()='CVC/CVV']//[@class='input__sub']");    // Сообщение об ошибке cvc/cvv
    private SelenideElement successfulMessage = $x("//div[text()=\"Успешно\"]");   // сообщение Успешно
    private SelenideElement errorMessage = $x("//div[text()=\"Ошибка\"]");   // сообщение Ошибка

    public void cardPayment() {                          //после нажатия кнопки Купить становится видно Оплата по карте
        buyButton.click();
        paymentMethod.shouldBe(Condition.visible);
    }

    public void emptyForm() {                          //Все поля пустые, нажимаем Продолжить - во всех полях ошибки
        continueButton.click();
        cardNumberFieldError.shouldBe(Condition.visible);
        monthFieldError.shouldBe(Condition.visible);
        yearFieldError.shouldBe(Condition.visible);
        ownerFieldError.shouldBe(Condition.visible);
        cvvFieldError.shouldBe(Condition.visible);
    }



}
