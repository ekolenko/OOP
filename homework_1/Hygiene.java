package homework_1;

public class Hygiene extends Product{

    private int countPack;

    public Hygiene(String name, double price, double count, String unit, int countPack) {
        super(name, price, count, unit);
        this.countPack = countPack;
    }
    
    @Override
    public String toString() {
        
        return  String.format("%s%nКоличество в упаковке: %d", 
                              super.toString(), countPack);        
        
    }
}
