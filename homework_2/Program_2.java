package homework_2;

import java.util.Scanner;

import homework_2.zoo.Zoo;

public class Program_2 {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Scanner console = new Scanner(System.in);
        
        CLI.showHelloMessage();        
     
        while (true) CLI.zooCommand(zoo,console);
    
    }
    
}
