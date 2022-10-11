package homework_2;

import java.util.Scanner;

import homework_2.animals.Aist;
import homework_2.animals.Cat;
import homework_2.animals.Chicken;
import homework_2.animals.Dog;
import homework_2.animals.Tiger;
import homework_2.animals.Wolf;
import homework_2.zoo.Zoo;

public class CLI {

    static void showHelloMessage () {

        System.out.println("Добро пожаловать в зоопарк!");
    }
    
    static void showMainMenu () {

        System.out.println(new StringBuilder()
                            .append("Выберите действие:\n")
                            .append("1. Добавить животное в зоопарк\n")
                            .append("2. Убрать животное из зоопарка\n")
                            .append("3. Посмотреть информацию о животном\n")
                            .append("4. Поговорить с животным\n")
                            .append("5. Посомтреть информацию обо всех животных\n")
                            .append("6. Поговорить со всеми животными\n")
                            .append("0. Покинуть зоопарк.")

        );
    } 

    static void showAnimalMenu () {

        System.out.println(new StringBuilder()
                            .append("Выберите животное для добавления:\n")
                            .append("1. Кот\n")
                            .append("2. Тигр\n")
                            .append("3. Собака\n")
                            .append("4. Волк\n")
                            .append("5. Курица\n")
                            .append("6. Аист\n")
                            .append("0. Вернуться в главное меню.")

        );
    }

    static float getWeight(Scanner console) {

        System.out.print("Введите вес животного: ");
        return (float)console.nextDouble();

    }

    static float getHeight(Scanner console) {

        System.out.print("Введите рост животного: ");
        return (float)console.nextDouble();
        
    }

    static String getColorEyes(Scanner console) {

        System.out.print("Введите цвет глаз животного: ");
        return console.next();
        
    }

    static String getName(Scanner console) {

        System.out.print("Введите кличку животного: ");
        return console.next();
        
    }

    static String getBreed(Scanner console) {

        System.out.print("Введите породу животного: ");
        return console.next();
        
    }

    static boolean getVaccination(Scanner console) {

        System.out.print("Имеются ли прививки?\n1. Да\n2. Нет\n--> ");
        String choice = console.next();
        if (choice == "1")
            return true;
        else
            return false;  
    }

    static String getColorWool(Scanner console) {

        System.out.print("Введите цвет шерсти животного: ");
        return console.next();
        
    }

    static String getBirthDay(Scanner console) {

        System.out.print("Введите дату рождения животного: ");
        return console.next();
        
    }

    static String getLivePlace(Scanner console) {

        System.out.print("Введите место обитания животного: ");
        return console.next();
        
    }

    static String getFindDay(Scanner console) {

        System.out.print("Введите дату нахождения животного: ");
        return console.next();
        
    }

    static boolean getCatWool(Scanner console) {

        System.out.print("Имеется ли шерсть у кота?\n1. Да\n2. Нет\n--> ");
        String choice = console.next();
        if (choice == "1")
            return true;
        else
            return false;       
        
    }

    static boolean getDogTrained(Scanner console) {

        System.out.print("Дрессирована ли собака?\n1. Да\n2. Нет\n--> ");
        String choice = console.next();
        if (choice == "1")
            return true;
        else
            return false;       
        
    }

    static boolean getWolfAlfa(Scanner console) {

        System.out.print("Является волк вожаком?\n1. Да\n2. Нет\n--> ");
        String choice = console.next();
        if (choice == "1")
            return true;
        else
            return false;       
        
    }

    static float getAltitude(Scanner console) {

        System.out.print("Введите высоту полета: ");
        return (float)console.nextDouble();     
        
    }

    static void zooCommand(Zoo zoo,Scanner console) {

        showMainMenu();

        switch ((int)(console.nextInt())) {
            
            case 1: 
                addCommand(zoo, console);
                break;
            case 2:
                removeCommand(zoo, console);
                break;
            case 3:
                infoCommand(zoo, console);
                break;
            case 4:
                voiceCommand(zoo, console);
                break;
            case 5:
                zoo.infoAll();
                break;
            case 6:
                zoo.voiceAll();
                break;
            case 0:
                System.exit(0);
        }

    }

    static void addCatCommand(Zoo zoo, Scanner console) {

        Cat cat = new Cat(
                        getHeight(console),
                        getWeight(console), 
                        getColorEyes(console),
                        getName(console),
                        getBreed(console),
                        getVaccination(console),
                        getColorWool(console),
                        getBirthDay(console),
                        getCatWool(console)
                        );
        zoo.add(cat);
        System.out.println("Кот добавлен в зоопарк!");
                        
    }

    static void addTigerCommand(Zoo zoo, Scanner console) {

        Tiger tiger = new Tiger(
                        getHeight(console),
                        getWeight(console), 
                        getColorEyes(console),
                        getLivePlace(console),
                        getFindDay(console)
                        );
        zoo.add(tiger);
        System.out.println("Тигр добавлен в зоопарк!");
                        
    }

    static void addDogCommand(Zoo zoo, Scanner console) {

        Dog dog = new Dog(
                        getHeight(console),
                        getWeight(console), 
                        getColorEyes(console),
                        getName(console),
                        getBreed(console),
                        getVaccination(console),
                        getColorWool(console),
                        getBirthDay(console),
                        getDogTrained(console)
        );
        zoo.add(dog);
        System.out.println("Собака добавлена в зоопарк!");
    }

    static void addWolfCommand(Zoo zoo, Scanner console) {

        Wolf wolf = new Wolf(
                        getHeight(console),
                        getWeight(console), 
                        getColorEyes(console),
                        getLivePlace(console),
                        getFindDay(console),
                        getWolfAlfa(console)
                        );
        zoo.add(wolf);
        System.out.println("Волк добавлен в зоопарк!");
    }

    static void addChickenCommand(Zoo zoo, Scanner console) {

        Chicken chiken = new Chicken(
                        getHeight(console),
                        getWeight(console), 
                        getColorEyes(console),
                        getAltitude(console)
                        );
        zoo.add(chiken);
        System.out.println("Курица добавлена в зоопарк!");
    }

    static void addAistCommand(Zoo zoo, Scanner console) {

        Aist aist = new Aist(
                        getHeight(console),
                        getWeight(console), 
                        getColorEyes(console),
                        getAltitude(console)
                        );
        zoo.add(aist);
        System.out.println("Аист добавлен в зоопарк!");
    }




    static void addCommand(Zoo zoo, Scanner console) {

        showAnimalMenu();
        switch ((int)(console.nextInt())) {

            case 1: 
                addCatCommand(zoo, console);
                break;
            case 2:
                addTigerCommand(zoo, console);
                break;
            case 3:
                addDogCommand(zoo, console);
                break;
            case 4:
                addWolfCommand(zoo, console);
                break;
            case 5:
                addChickenCommand(zoo, console);
                break;
            case 6:
                addAistCommand(zoo, console);;
                break;
            case 0:
                zooCommand(zoo, console);


        }
        
        
    }

    static void removeCommand (Zoo zoo, Scanner console) {

        int count = zoo.getCount();
        System.out.printf("В зоопарке %d животных. Какой животное удалить?\n--> ",count);
        int choice = console.nextInt();
        if (choice > count) {
            System.out.println("Такого животного нет в зоопарке!");
        }
        else {
            zoo.remove(choice);
        }

    }

    static void infoCommand (Zoo zoo, Scanner console) {

        int count = zoo.getCount();
        System.out.printf("В зоопарке %d животных. Информацию о каком животном вывести?\n--> ",count);
        int choice = console.nextInt();
        if (choice > count) {
            System.out.println("Такого животного нет в зоопарке!");
        }
        else {
            zoo.info(choice);;
        }

    }

    static void voiceCommand (Zoo zoo, Scanner console) {

        int count = zoo.getCount();
        System.out.printf("В зоопарке %d животных. C каким животным Вы хотите поговорить?\n--> ",count);
        int choice = console.nextInt();
        if (choice > count) {
            System.out.println("Такого животного нет в зоопарке!");
        }
        else {
            zoo.voice(choice);;
        }

    }
}

