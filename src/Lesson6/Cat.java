package Lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    int maxRunLength = 200;

    @Override
    void run(int runDistance) {
        if (runDistance < maxRunLength) {
            System.out.println(
                    name + " пробежала " + runDistance + " м.");
        } else {
            System.out.println(name + " не смогла пробежать дистанцию " + runDistance + " м., так как максимум сможет пробежать " + maxRunLength + " м.");
        }
    }


    @Override
    void canSwim(int swimDistance) {
        System.out.println("Кошки не умеют плавать.\n");
    }
}
