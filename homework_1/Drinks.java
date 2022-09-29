package homework_1;

public class Drinks extends Product {

    private double volume;

    public Drinks(String name, double price, double count, String unit, double volume)    
    {
    
        super(name, price, count, unit);
        this.volume = volume;

    }
    
    @Override
    public String toString() {
        
        return  String.format("%s%nОбъем: %.1f", 
                              super.toString(), volume);        
        
    }
}
