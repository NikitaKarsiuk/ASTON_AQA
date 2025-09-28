//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Lesson_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MtsBlockTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final String BASE_URL = "https://mts.by";
    private static final String PHONE_DATA = "297777777";
    private static final String SUM_DATA = "10";
    private static final String EMAIL_DATA = "test@mail.ru";
    private static final By TITLE = By.xpath("//h2[contains(text(), 'Онлайн пополнение')]");
    private static final By VISA_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg')]");
    private static final By VISA_VERIFIED_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg')]");
    private static final By MASTERCARD_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg')]");
    private static final By MASTERCARD_SECURE_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg')]");
    private static final By BELKART_LOGO = By.xpath("//img[(@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg')]");
    private static final By DETAILS_LINK = By.xpath("//a[contains(text(), 'Подробнее о сервисе')]");
    private static final By PAYMENT_PAGE_TITLE = By.xpath("//span[text()='Порядок оплаты и безопасность интернет платежей']");
    private static final By PHONE_FIELD = By.id("connection-phone");
    private static final By SUM_FIELD = By.id("connection-sum");
    private static final By EMAIL_FIELD = By.id("connection-email");
    private static final By NEXT_BUTTON = By.xpath("//*[@id='pay-connection']/button");
    private static final By ACCEPT_BUTTON = By.xpath("//button[text()='Принять']");
    private static final By IFRAME = By.xpath("//iframe[contains(@class, 'bepaid-iframe')]");

    public MtsBlockTest() {
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(this.driver, 10L);
        this.driver.manage().window().maximize();
        this.driver.get("https://mts.by");
        this.acceptCookies();
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void testBlockTitle() {
        String actualText = this.driver.findElement(TITLE).getText();
        Assert.assertEquals(actualText, "Онлайн пополнение\nбез комиссии", "Название блока не совпадает");
        System.out.println("testBlockTitle - выполнен");
    }

    @Test
    public void testPaymentLogos() {
        Assert.assertTrue(this.driver.findElement(VISA_LOGO).isDisplayed(), "Логотип 'Visa' не найден");
        Assert.assertTrue(this.driver.findElement(VISA_VERIFIED_LOGO).isDisplayed(), "Логотип 'Verified by Visa' не найден");
        Assert.assertTrue(this.driver.findElement(MASTERCARD_LOGO).isDisplayed(), "Логотип 'Mastercard' не найден");
        Assert.assertTrue(this.driver.findElement(MASTERCARD_SECURE_LOGO).isDisplayed(), "Логотип 'Mastercard SecureCode' не найден");
        Assert.assertTrue(this.driver.findElement(BELKART_LOGO).isDisplayed(), "Логотип 'Belkart' не найден");
        System.out.println("testPaymentLogos - выполнен");
    }

    @Test
    public void testDetailsLink() {
        WebElement link = this.driver.findElement(DETAILS_LINK);
        Assert.assertTrue(link.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена");
        link.click();
        String pageTitleText = this.driver.findElement(PAYMENT_PAGE_TITLE).getText();
        Assert.assertEquals(pageTitleText, "Порядок оплаты и безопасность интернет платежей", "Текст 'Порядок оплаты и безопасность интернет платежей' не найден");
        System.out.println("testDetailsLink - выполнен");
    }

    @Test
    public void testPaymentForm() {
        this.fillPaymentForm();
        this.clickNextButton();
        this.IframeOpened();
        System.out.println("testPaymentForm - выполнен");
    }

    private void acceptCookies() {
        try {
            WebElement acceptButton = this.driver.findElement(ACCEPT_BUTTON);
            Assert.assertTrue(acceptButton.isDisplayed(), "Кнопка 'Принять' не отображается");
            acceptButton.click();
        } catch (Exception var2) {
            System.out.println("Кнопка принятия куки не найдена или уже приняты");
        }

    }

    private void fillPaymentForm() {
        WebElement phoneField = this.driver.findElement(PHONE_FIELD);
        phoneField.sendKeys(new CharSequence[]{"297777777"});
        WebElement sumField = this.driver.findElement(SUM_FIELD);
        sumField.sendKeys(new CharSequence[]{"10"});
        WebElement emailField = this.driver.findElement(EMAIL_FIELD);
        emailField.sendKeys(new CharSequence[]{"test@mail.ru"});
    }

    private void clickNextButton() {
        WebElement buttonNext = (WebElement)this.wait.until(ExpectedConditions.presenceOfElementLocated(NEXT_BUTTON));
        Assert.assertTrue(buttonNext.isEnabled(), "Кнопка 'Продолжить' не активна");
        buttonNext.click();
    }

    private void IframeOpened() {
        WebElement iframe = (WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(IFRAME));
        Assert.assertTrue(iframe.isDisplayed(), "iframe не отображается");
    }
}
