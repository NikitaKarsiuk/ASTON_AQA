package Lesson_10;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class HomePage extends BasePage {
    private static final By ACCEPT_BUTTON = By.xpath("//button[text()='Принять']");
    private static final By TITLE = By.xpath("//h2[contains(text(), 'Онлайн пополнение')]");
    private static final By VISA_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg')]");
    private static final By VISA_VERIFIED_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg')]");
    private static final By MASTERCARD_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg')]");
    private static final By MASTERCARD_SECURE_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg')]");
    private static final By BELKART_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg')]");
    private static final By DETAILS_LINK = By.xpath("//a[contains(text(), 'Подробнее о сервисе')]");
    private static final By PHONE_FIELD = By.id("connection-phone");
    private static final By SUM_FIELD = By.id("connection-sum");
    private static final By EMAIL_FIELD = By.id("connection-email");
    private static final By NEXT_BUTTON = By.xpath("//*[@id='pay-connection']/button");
    private static final By IFRAME = By.xpath("//iframe[contains(@class, 'bepaid-iframe')]");
    private static final By WRAPPER_BLOCK = By.xpath("//div[@class='select__wrapper']");
    private static final By SELECTED_TAB = By.xpath("//div[@class='select__wrapper']/button");
    private static final By IFRAME_MAIN_SUM_LABEL = By.xpath("//span[@class='ng-star-inserted']");
    private static final By IFRAME_PAYMENT_BUTTON = By.xpath("//div[@class='card-page__card']/button");
    private static final By IFRAME_PHONE_TEXT = By.xpath("//div[@class='pay-description__text']/span");
    private static final By VISA_FRAME_LOGO = By.xpath("//img[(@src='assets/images/payment-icons/card-types/visa-system.svg')]");
    private static final By MASTERCARD_FRAME_LOGO = By.xpath("//img[(@src='assets/images/payment-icons/card-types/mastercard-system.svg')]");
    private static final By BELKART_FRAME_LOGO = By.xpath("//img[(@src='assets/images/payment-icons/card-types/belkart-system.svg')]");
    private static final By MIR_FRAME_LOGO = By.xpath("//img[(@src='assets/images/payment-icons/card-types/mir-system-ru.svg')]");
    private static final By MAESTRO_FRAME_LOGO = By.xpath("//img[(@src='assets/images/payment-icons/card-types/maestro-system.svg')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие главной страницы")
    public void openPage(){
        driver.get("https://mts.by");
        acceptCookies();
    }

    @Step("Проверка заголовка блока 'Онлайн пополнение без комиссии'")
    public void verifyBlockTitle() {
        Assert.assertEquals(driver.findElement(TITLE).getText(), "Онлайн пополнение\nбез комиссии", "Название блока не совпадает");
    }

    @Step("Проверка логотипов платежных систем")
    public void verifyPaymentLogos() {
        Assert.assertTrue(driver.findElement(VISA_LOGO).isDisplayed(), "Логотип 'Visa' не найден");
        Assert.assertTrue(driver.findElement(VISA_VERIFIED_LOGO).isDisplayed(), "Логотип 'Verified by Visa' не найден");
        Assert.assertTrue(driver.findElement(MASTERCARD_LOGO).isDisplayed(), "Логотип 'Mastercard' не найден");
        Assert.assertTrue(driver.findElement(MASTERCARD_SECURE_LOGO).isDisplayed(), "Логотип 'Mastercard SecureCode' не найден");
        Assert.assertTrue(driver.findElement(BELKART_LOGO).isDisplayed(), "Логотип 'Belkart' не найден");
    }

    @Step("Проверка отображения ссылки 'Подробнее о сервисе'")
    public void DetailsLinkIsDisplayed() {
        Assert.assertTrue(driver.findElement(DETAILS_LINK).isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена");
    }

    @Step("Клик по ссылке 'Подробнее о сервисе'")
    public void clickDetailsLink(){
        driver.findElement(DETAILS_LINK).click();
    }

    @Step("Заполнение формы платежа: телефон, сумма, email")
    public void fillPaymentForm(String phone, String sum, String email) {
        driver.findElement(PHONE_FIELD).sendKeys(phone);
        driver.findElement(SUM_FIELD).sendKeys(sum);
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    @Step("Клик по кнопке 'Продолжить'")
    public void clickNextButton() {
        driver.findElement(NEXT_BUTTON).click();
    }

    @Step("Проверка кликабельности кнопки 'Продолжить'")
    public void nextButtonIsEnabled() {
        Assert.assertTrue(driver.findElement(NEXT_BUTTON).isEnabled(), "Кнопка 'Продолжить' не кликабельна");
    }

    @Step("Проверка отображения платежного iframe")
    public void paymentFrameIsDisplayed() {
            WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(IFRAME));
            Assert.assertTrue(iframe.isDisplayed(), "iframe не отображается");
    }

    @Step("Выбор вкладки: {tabName}")
    public void selectTab(String tabName) {
        driver.findElement(By.xpath(String.format("//ul[@class='select__list']//p[text()='%s']",tabName))).click();
    }

    @Step("Проверка активной вкладки {expectedResult}")
    public void activeTab(String expectedResult){
        Assert.assertEquals(driver.findElement(SELECTED_TAB).getText(), expectedResult, "Неверный таб");
    }

    @Step("Клик по блоку выбора вкладки")
    public void clickTab(){
        driver.findElement(WRAPPER_BLOCK).click();
    }

    @Step("Проверка активности блока выбора вкладки")
    public void tabIsEnabled(){
        Assert.assertTrue(driver.findElement(WRAPPER_BLOCK).isEnabled(), "Таб для блока не активен");
    }
    @Step("Проверка placeholder для элемента платежной формы. Ожидаемый: {expectedResult}")
    public void placeholderCheck(By locator, String expectedResult) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed(), "Элемент не отображается");
        Assert.assertEquals(element.getAttribute("placeholder"), expectedResult, "Placeholder не соответствует " + expectedResult);
    }

    @Step("Переключение на платежный iframe")
    public void switchToFrame(){
        driver.switchTo().frame(driver.findElement(IFRAME));
    }

    @Step("Проверка основной суммы на iframe. Ожидаемая: {expectedSum}")
    public void checkMainSum(String expectedSum)
    {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(IFRAME_MAIN_SUM_LABEL));
        double actualNumber = Double.parseDouble(element.getText().replace(" BYN", "").trim());
        Assert.assertEquals(String.format("%.2f", actualNumber).replace(',', '.') + " BYN", String.format("%.2f", Double.parseDouble(expectedSum)).replace(',', '.') + " BYN", "Ожидаемая сумма " + expectedSum + " BYN");
    }

    @Step("Проверка суммы на кнопке. Ожидаемая: {expectedSum}")
    public void checkButtonSum(String expectedSum)
    {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(IFRAME_PAYMENT_BUTTON));
        double actualNumber = Double.parseDouble(element.getText().replace(" BYN", "").trim().replace("Оплатить ", "").trim());
        Assert.assertEquals(String.format("%.2f", actualNumber).replace(',', '.') + " BYN", String.format("%.2f", Double.parseDouble(expectedSum)).replace(',', '.') + " BYN", "Ожидаемая сумма " + expectedSum + " BYN");
    }

    @Step("Проверка номера телефона. Ожидаемый: {expectedtext}")
    public void checkPhone(String expectedtext)
    {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(IFRAME_PHONE_TEXT));
        Assert.assertEquals(element.getText().substring(element.getText().indexOf("Номер:") + "Номер:".length()).trim(), "375" + expectedtext, "Некорректный номер телефона");
    }

    @Step("Проверка placeholder в iframe. Ожидаемый: {expectedResult}")
    public void placeholderFrameCheck(By locator, String expectedResult) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed(), "Элемент не отображается");
        Assert.assertEquals(element.getText(), expectedResult, "Placeholder не соответствует " + expectedResult);
    }

    @Step("Проверка логотипов платежных систем в iframe")
    public void verifyPaymentLogosFrame(){
        Assert.assertTrue(driver.findElement(VISA_FRAME_LOGO).isDisplayed(), "Логотип 'Visa' не найден");
        Assert.assertTrue(driver.findElement(MASTERCARD_FRAME_LOGO).isDisplayed(), "Логотип 'Mastercard' не найден");
        Assert.assertTrue(driver.findElement(BELKART_FRAME_LOGO).isDisplayed(), "Логотип 'Belkart' не найден");
        Assert.assertTrue(driver.findElement(MAESTRO_FRAME_LOGO ).isDisplayed(), "Логотип 'Maestro' не найден");
        Assert.assertTrue(driver.findElement(MIR_FRAME_LOGO).isDisplayed(), "Логотип 'Mir' не найден");
    }

    @Step("Принятие cookies")
    private void acceptCookies() {
        try {
            WebElement acceptButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ACCEPT_BUTTON));
            Assert.assertTrue(acceptButton.isDisplayed(), "Кнопка 'Принять' не отображается");
            acceptButton.click();
        } catch (Exception var2) {
            System.out.println("Кнопка принятия куки не найдена или уже приняты");
        }
    }
}