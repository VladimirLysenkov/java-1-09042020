package Lesson7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Список кошек:");
        Cat[] x = {new Cat("Ава", 3), new Cat("Шэби", 10), new Cat("Барсик", 2)};
        for (Cat c : x) {
            System.out.println(c);
        }

        Plate plate = new Plate(10);
        plate.addPlateCapacity(0);
        System.out.println("\n" + plate);
        System.out.println("\nКошки покушали из тарелок:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }

    }


}
