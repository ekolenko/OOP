package homework_1;

public class Product {

    private String name;
    private double price;
    private double count;
    private String unit;

    public Product(String name, double price, double count, String unit) {

        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
        
    }
    
    @Override
    public String toString() {
        return String.format("Название: %s%nЦена: %.2f%nКоличество: %.1f%nЕдиница измерения: %s", 
                             name, price, count, unit);
    }
}
