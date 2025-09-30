//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MtsBlockTest {
    private WebDriver driver;
    private HomePage homePage;
    private PaymentDetailsPage paymentDetailsPage;

    private static final String PHONE_DATA = "297777777";
    private static final String SUM_DATA = "10";
    private static final String EMAIL_DATA = "test@mail.ru";
    private static final String SERVICES_TAB = "Услуги связи";
    private static final String INTERNET_TAB = "Домашний интернет";
    private static final String PAYMENT_TAB = "Рассрочка";
    private static final String DEBT_TAB =  "Задолженность";
    private static final String PHONE_PLACEHOLDER_DATA = "Номер телефона";
    private static final String SUM_PLACEHOLDER_DATA = "Сумма";
    private static final String EMAIL_PLACEHOLDER_DATA = "E-mail для отправки чека";
    private static final String SCORE_PAYMENT_PLACEHOLDER_DATA = "Номер счета на 44";
    private static final String SCORE_DEBT_PLACEHOLDER_DATA = "Номер счета на 2073";
    private static final By PHONE_FIELD = By.id("connection-phone");
    private static final By SUM_FIELD = By.id("connection-sum");
    private static final By EMAIL_FIELD = By.id("connection-email");
    private static final By SCORE_PAYMENT_FIELD = By.id("score-instalment");
    private static final By SCORE_DEBT_FIELD = By.id("score-arrears");
    private static final By CARD_NUMBER_FIELD = By.xpath("//div[@class='content ng-tns-c2312288139-3']/label");
    private static final By CARD_VALIDITY_PERIOD_FIELD = By.xpath("//div[@class='content ng-tns-c2312288139-6']/label");
    private static final By CARD_CVC_FIELD = By.xpath("//div[@class='content ng-tns-c2312288139-7']/label");
    private static final By CARD_FIO_FIELD = By.xpath("//div[@class='content ng-tns-c2312288139-5']/label");
    private static final String CARD_NUMBER_PLACEHOLDER_DATA = "Номер карты";
    private static final String CARD_VALIDITY_PERIOD_PLACEHOLDER_DATA = "Срок действия";
    private static final String CARD_CVC_PLACEHOLDER_DATA = "CVC";
    private static final String CARD_FIO_PLACEHOLDER_DATA = "Имя и фамилия на карте";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
            homePage.openPage();
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

        @Test
        public void testBlockTitle() {
            homePage.verifyBlockTitle();
        }
        @Test
        public void testPaymentLogos() {
            homePage.verifyPaymentLogos();
        }

        @Test
        public void testDetailsLink() {
            homePage.DetailsLinkIsDisplayed();
            homePage.clickDetailsLink();

            paymentDetailsPage = new PaymentDetailsPage(driver);
            paymentDetailsPage.verifyPaymentPageTitle();
        }

        @Test
        public void testPaymentForm() {

            homePage.fillPaymentForm(PHONE_DATA, SUM_DATA, EMAIL_DATA);
            homePage.nextButtonIsEnabled();
            homePage.clickNextButton();
            homePage.paymentIframeIsDisplayed();
        }
        @Test
        public void testServicesTabFields() {
            homePage.tabIsEnabled();
            homePage.activeTab(SERVICES_TAB);
            homePage.placeholderCheck(PHONE_FIELD, PHONE_PLACEHOLDER_DATA);
            homePage.placeholderCheck(SUM_FIELD, SUM_PLACEHOLDER_DATA);
            homePage.placeholderCheck(EMAIL_FIELD, EMAIL_PLACEHOLDER_DATA);
        }

        @Test
        public void testInternetTabFields() {
            homePage.tabIsEnabled();
            homePage.clickTab();
            homePage.selectTab(INTERNET_TAB);
            homePage.activeTab(INTERNET_TAB);
            homePage.placeholderCheck(PHONE_FIELD, PHONE_PLACEHOLDER_DATA);
            homePage.placeholderCheck(SUM_FIELD, SUM_PLACEHOLDER_DATA);
            homePage.placeholderCheck(EMAIL_FIELD, EMAIL_PLACEHOLDER_DATA);
        }

        @Test
        public void testPaymentTabFields() {
            homePage.tabIsEnabled();
            homePage.clickTab();
            homePage.selectTab(PAYMENT_TAB);
            homePage.activeTab(PAYMENT_TAB);
            homePage.placeholderCheck(SCORE_PAYMENT_FIELD, SCORE_PAYMENT_PLACEHOLDER_DATA);
            homePage.placeholderCheck(SUM_FIELD, SUM_PLACEHOLDER_DATA);
            homePage.placeholderCheck(EMAIL_FIELD, EMAIL_PLACEHOLDER_DATA);
        }
        @Test
        public void testDebtTabFields() {
        homePage.tabIsEnabled();
        homePage.clickTab();
        homePage.selectTab(DEBT_TAB);
        homePage.activeTab(DEBT_TAB);
        homePage.placeholderCheck(SCORE_DEBT_FIELD, SCORE_DEBT_PLACEHOLDER_DATA);
        homePage.placeholderCheck(SUM_FIELD, SUM_PLACEHOLDER_DATA);
        homePage.placeholderCheck(EMAIL_FIELD, EMAIL_PLACEHOLDER_DATA);
    }
        @Test
        public void testPaymentIFrame() {

            homePage.fillPaymentForm(PHONE_DATA, SUM_DATA, EMAIL_DATA);
            homePage.nextButtonIsEnabled();
            homePage.clickNextButton();
            homePage.paymentIframeIsDisplayed();
            homePage.switchToFrame();
            homePage.checkMainSum(SUM_DATA);
            homePage.checkButtonSum(SUM_DATA);
            homePage.checkPhone(PHONE_DATA);
            homePage.placeholderFrameCheck(CARD_NUMBER_FIELD, CARD_NUMBER_PLACEHOLDER_DATA);
            homePage.placeholderFrameCheck(CARD_VALIDITY_PERIOD_FIELD, CARD_VALIDITY_PERIOD_PLACEHOLDER_DATA);
            homePage.placeholderFrameCheck(CARD_CVC_FIELD, CARD_CVC_PLACEHOLDER_DATA);
            homePage.placeholderFrameCheck(CARD_FIO_FIELD, CARD_FIO_PLACEHOLDER_DATA);
        }
}
