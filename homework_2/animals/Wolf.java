package homework_2.animals;

public class Wolf extends WildAnimal{

    private boolean alfa;

    public Wolf(float height, float weight, String colorEyes, String livePlace, String findDate, boolean alfa) {

        super(height, weight, colorEyes, livePlace, findDate, "Ууу - ууу");
        this.alfa = alfa;

    }

    @Override
    public String toString() {
        
        return String.format("Волк%n%sВожак стаи: %s", 
                            super.toString(), alfa ? "Да" : "Нет");
    }

}
