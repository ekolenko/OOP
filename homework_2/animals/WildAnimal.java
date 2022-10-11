package homework_2.animals;

public class WildAnimal extends Animal{
    
    private String livePlace;
    private String findDate;

    public WildAnimal (float height, float weight, String colorEyes, String livePlace, String findDate, String sound) {

        super(height, weight, colorEyes, sound);
        this.livePlace = livePlace;
        this.findDate = findDate;

    }

    @Override
    public String toString() {
    
        return String.format("%sМесто жительства: %s%nДата нахождения: %s%", 
                            super.toString(), livePlace, findDate);
    }
}
