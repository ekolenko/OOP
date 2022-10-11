package homework_2.animals;

public class Tiger extends WildAnimal {
    
    public Tiger(float height, float weight, String colorEyes, String livePlace, String findDate) {

        super(height, weight, colorEyes, livePlace, findDate, "Ррр- ррр");

    }
    
    @Override
    public String toString() {
        
        return  String.format("Тигр%n%s", 
                            super.toString());
    }
}
