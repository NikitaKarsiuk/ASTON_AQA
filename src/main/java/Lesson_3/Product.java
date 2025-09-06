package Lesson_3;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, int price, boolean isReserved)
    {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo()
    {
        System.out.printf("Информация о товаре: \nНазвание: %s \nДата производства: %s \n" +
                "Производитель: %s \nСтрана происхождения: %s \nЦена: %s\nСостояние бронирования покупателем: %s \n\n", name, productionDate, manufacturer, countryOfOrigin, price, isReserved);
    }
}
