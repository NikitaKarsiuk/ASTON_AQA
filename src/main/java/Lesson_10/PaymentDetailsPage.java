package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PaymentDetailsPage extends BasePage {
    private static final By PAYMENT_PAGE_TITLE = By.xpath("//span[text()='Порядок оплаты и безопасность интернет платежей']");

    public PaymentDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyPaymentPageTitle() {

        Assert.assertEquals(driver.findElement(PAYMENT_PAGE_TITLE).getText(), "Порядок оплаты и безопасность интернет платежей", "Текст 'Порядок оплаты и безопасность интернет платежей' не найден");
    }
}
