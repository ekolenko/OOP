package homework_2.animals;

public class HomeAnimal extends Animal {

    private String name;
    private String breed;
    private boolean vaccination;
    private String colorWool;
    private String birthday;

    public void kindness() {

    }

    public HomeAnimal(float height, float weight, String colorEyes, String name, String breed, boolean vaccination, String colorWool, String birthday, String sound) {
        
        super(height, weight, colorEyes, sound);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.colorWool = colorWool;
        this.birthday = birthday;

    }

    @Override
    public String toString() {
        
        return String.format("%sИмя: %s%nПорода: %s%nВакцинирован: %s%nЦвет шерсти: %s%nДата рождения: %s", 
                            super.toString(),name, breed, vaccination ? "Да" : "Нет", colorWool, birthday);
    
    }
    
}
