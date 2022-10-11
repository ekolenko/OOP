package homework_2.animals;

public abstract class Animal implements VoiceAble {
    
    private float height;
    private float weight;
    private String colorEyes;

    private String sound;

    public Animal (float height, float weight, String colorEyes, String sound) {

        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
        this.sound = sound;


    }


    public void voice() {

        System.out.println(sound);

    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        
        return String.format("Рост: %.2f%nВес: %.2f%nЦвет глаз: %s", 
                            height, weight, colorEyes);
    }
}
