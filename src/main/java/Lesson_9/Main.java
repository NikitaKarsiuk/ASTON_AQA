package Lesson_9;

public class Main {

    public static void main(String[] args) {
        MtsBlockTest test = new MtsBlockTest();
        try {
            test.setUp();
            test.testBlockTitle();
            //test.testPaymentLogos();
            //test.testDetailsLink();
            //test.testPaymentForm();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            test.tearDown();
        }
    }
}