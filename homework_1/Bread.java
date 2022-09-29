package homework_1;

public class Bread extends Food{

    private String flourType;

    public Bread(String name, double price, double count, String unit, int ttl, String flourType) {

        super(name, price, count, unit, ttl);
        this.flourType = flourType;

    }

    @Override
    public String toString() {
        
        return  String.format("%s%nТип муки: %s", 
                              super.toString(), flourType);        
        
    }
    
}