package homework_2.animals;

public class Dog extends HomeAnimal{
    
    private boolean trained;

    public Dog (float height, float weight, String colorEyes, String name, String breed, boolean vaccination, String colorWool, String birthday, boolean trained) {

        super(height, weight, colorEyes, name, breed, vaccination, colorWool, birthday, "Гав - гав");
        this.trained = trained;

    }

    public void train() {
        trained = true;
    }

    @Override
    public String toString() {
        
        return String.format("Собака%sДрессирован: %s", 
                            super.toString(), trained ? "Да" : "Нет");
    }
}
