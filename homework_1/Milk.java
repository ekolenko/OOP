package homework_1;

public class Milk extends Drinks{

    private int ttl;

    public Milk (String name, double price, double count, String unit, double volume, int ttl) {

        super(name, price, count, unit, volume);
        this.ttl = ttl;
    }
    
    @Override
    public String toString() {
        
        return  String.format("%s%nСрок годности: %d", 
                              super.toString(), ttl);        
        
    }
}
