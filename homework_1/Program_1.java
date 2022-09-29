package homework_1;

import java.util.ArrayList;

public class Program_1 {

    public static void printProduct(ArrayList<Product> list) {

        for (Product product : list) {

            System.out.println(product);
            System.out.println("------------------------------");
            
        }
    }

    public static void main(String[] args) {

        Milk milk = new Milk("Молоко", 35.7, 200, "Пакет", 3.5, 72);
        Lemonade lemonade = new Lemonade("Лимонад", 89.90, 100, "Бутылка", 1.5);
        Bread bread = new Bread("Хлеб", 45.5, 300, "Булка", 72, "Высший сорт");
        Eggs eggs = new Eggs("Яйцо", 102.0, 50, "Клетка", 180, 10);
        Masks masks = new Masks("Маска", 15.3, 1000, "Пачка", 10);
        TPaper tPaper = new TPaper("Туалетная бумага", 205, 1000, "Упаковка", 10, 3);
        Diapers diapers = new Diapers("Подгузники", 1500, 30, "Упаковка", 2, "Гипоаллергенно", 3, 7.5, 10, "Трусы");
        Nipple nipple = new Nipple("Соска", 120.8, 10, "Штука", 1, "Гипоаллергенно");

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(milk);
        productList.add(lemonade);
        productList.add(bread);
        productList.add(eggs);
        productList.add(masks);
        productList.add(tPaper);
        productList.add(diapers);
        productList.add(nipple);

        printProduct(productList);

  
    }
    
}