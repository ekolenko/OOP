package homework_2.animals;

public class Chicken extends Bird{
    
   
    public Chicken(float height, float weight, String colorEyes, float altitude) {

        super(height, weight, colorEyes, altitude, "Ко - ко - ко");
        
    }

    @Override
    public String toString() {
        
        return  String.format("Курица%n%s", 
                            super.toString());
    }


}


