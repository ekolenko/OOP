package homework_2.animals;

public abstract class Bird extends Animal implements FlyAble{

    private float altitude;

    protected Bird (float height, float weight, String colorEyes, float altitude, String sound) {

        super(height, weight, colorEyes, sound);
        this.altitude = altitude;
        
    }

    public void fly() {

        System.out.printf("Я лечу на %s метрах!", altitude);
    }
    
    @Override
    public String toString() {
        
        return String.format("%sВысота полёта %.1f", 
                            super.toString(), altitude);
    }
   
}
