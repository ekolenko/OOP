package homework_1;

public class ChildProd extends Product {

    private int minAge;
    private String hypoAllergen;

    public ChildProd(String name, double price, double count, String unit, int minAge, String hypoAllergen) {
        
        super(name, price, count, unit);
        this.minAge = minAge;
        this.hypoAllergen = hypoAllergen;
    }

    @Override
    public String toString() {
        
        return  String.format("%s%nМинимальный возраст: %d%nГипоаллергенность: %s", 
                              super.toString(), minAge, hypoAllergen);        
        
    }
    
}