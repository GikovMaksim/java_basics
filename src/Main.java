import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Basket fedorBasket = new Basket();
        fedorBasket.add("Milk", 40);
        fedorBasket.add("Donut", 20,0.2);
        fedorBasket.add("Icecream", 20,10,0.1);
        fedorBasket.print("Федор");

        Basket senyaBasket = new Basket();
        senyaBasket.add("Apple", 100,1.0);
        senyaBasket.add("Pineapple",200, 1);
        senyaBasket.add("Egg",89,9);
        senyaBasket.add("Sugar",85,1.5);
        senyaBasket.print("Арсений");

        Elevator elevator = new Elevator(-3, 26);
        while(true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
