package homework_1;

public class Eggs extends Food{

    private int countPack;

    public Eggs(String name, double price, double count, String unit, int ttl, int countPack) {

        super(name, price, count, unit, ttl);
        this.countPack = countPack;

    }

    @Override
    public String toString() {
        
        return  String.format("%s%nКоличество в упаковке: %d", 
                              super.toString(), countPack);        
        
    }

    
}