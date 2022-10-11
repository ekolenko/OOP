package homework_2.animals;

public class Aist extends Bird{
    
   
    public Aist(float height, float weight, String colorEyes, float altitude) {

        super(height, weight, colorEyes, altitude, "Кря - кря -кря");
        
    }

    @Override
    public String toString() {
        
        return  String.format("Аист%n%s", 
                            super.toString());
    }


}


