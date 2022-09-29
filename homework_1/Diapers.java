package homework_1;

public class Diapers extends ChildProd{

    private int size;
    private double minWeight;
    private double maxWeight;
    private String type;

    public Diapers(String name, double price, double count, String unit, int minAge, String hypoAllergen, int size, double minWeight, double maxWeight, String type) {

        super(name, price, count, unit, minAge, hypoAllergen);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    
    }

    @Override
    public String toString() {
        
        return  String.format("%s%nРазмер: %d%nМинимальный вес: %.1f%nМаксимальный вес: %.1f%nТип: %s", 
                              super.toString(), size, minWeight, maxWeight, type);        
        
    }
    
}
