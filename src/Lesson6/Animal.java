package Lesson6;

public abstract class Animal {
    protected String name;

    abstract void run(int runDistance);
    abstract void canSwim(int swimDistance);

    public Animal(String name) {
        this.name = name;

    }

}
