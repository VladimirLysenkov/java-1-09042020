package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;


    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    @Override
    public String toString() {
        return name + ", аппетит = " + appetite + ", Кошка поела? = " + hungry;
    }

    void eat(Plate plate) {
        if (plate.getPlateCapacity() > appetite) {
            plate.decreaseFood(appetite);
            hungry = true;
        }
    }



}

