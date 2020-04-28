package Lesson6;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }
    int maxRunLength = 500;
    int maxSwimDistance = 10;

    @Override
    void run(int runDistance) {
        if (runDistance < maxRunLength) {
            System.out.println(name + " пробежал " + runDistance + " м.");
        } else {
            System.out.println(name + " не смог пробежать дистанцию " + runDistance + " м., так как максимум сможет пробежать " + maxRunLength + " м.");
        }
    }

    @Override
    void canSwim(int swimDistance) {
        if (swimDistance > 0 && swimDistance <= maxSwimDistance){
            System.out.println(name + " проплыл " + swimDistance + " м.");
        }
        else System.out.println(name + " не смог проплыть дистанцию " + swimDistance + " м., так как максимум сможет проплыть " + maxSwimDistance + " м.");
    }
}
