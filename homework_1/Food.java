package homework_1;

public class Food extends Product{
  
    private int ttl;

    public Food(String name, double price, double count, String unit, int ttl)
    {
        
        super(name, price, count, unit);
        this.ttl = ttl;
        
    }

    @Override
    public String toString() {
        
        return  String.format("%s%nСрок годности: %d", 
                              super.toString(), ttl);        
        
    }
}
