package homework_2.animals;

public class Cat extends HomeAnimal{

    private boolean wool;

    public Cat(float height, float weight, String colorEyes, String name, String breed, boolean vaccination, String colorWool, String birthday, boolean wool) {

        super(height, weight, colorEyes, name, breed, vaccination, colorWool, birthday, "Мяу - мяу");
        this.wool = wool;
    }
    
    @Override
    public String toString() {
        
        return String.format("Кот%n%sШерсть: %s", 
                            super.toString(), wool ? "Есть" : "Нет");
    }
}
