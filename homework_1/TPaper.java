package homework_1;

public class TPaper extends Hygiene {

    private int layerCount;

    public TPaper(String name, double price, double count, String unit, int countPack, int layerCount) {

        super(name, price, count, unit, countPack);
        this.layerCount = layerCount;

    }

    @Override
    public String toString() {
        
        return  String.format("%s%nКоличество слоёв: %d", 
                              super.toString(), layerCount);        
        
    }
    
}