package homework_2.zoo;

import java.util.Arrays;

import homework_2.animals.Animal;

public class Zoo {
    
    private Animal[] animals = new Animal[10];
    private int lastElement;

    private Animal[] expand(Animal[] array) {

        array = Arrays.copyOf(array, array.length + 10);
        return array;
 
    }

    public void add(Animal animal) {

        if (lastElement == animals.length) {

            animals = expand(animals);
        }
              
        animals[lastElement] = animal;
        lastElement++;
    }

    public void remove(int index) {

        if (index > lastElement - 1) {

            return;
        }
              
        for (int i = index; i < lastElement - 1; i++) {
            animals[i] = animals[i+1];

        }
        lastElement--;
    }

    public Animal getAnimal(int index) {

        return animals[index];
    }

    public void info(int index) {

        animals[index].info();

    }

    public void infoAll() {

        for (int i = 0; i < lastElement; i++)
        {
            animals[i].info();
            System.out.println();
        }
        

    }

    public void voice(int index) {

        animals[index].voice();

    }

    public void voiceAll() {

        for (int i = 0; i < lastElement; i++)
        {
            animals[i].voice();
            System.out.println();
        }
        

    }

    public int getCount() {
        
        return lastElement;
    }


    @Override
    public String toString() {

        var str = new StringBuilder();

        for (int i = 0; i <= lastElement; i++)
        {
            str.append(animals[i].toString());
        }

        return str.toString();

    }

}
