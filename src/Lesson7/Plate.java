package Lesson7;

public class Plate {
    private int plateCapacity;

    Plate(int plateCapacity) {
        this.plateCapacity = plateCapacity;
    }

    void decreaseFood(int appetite) {
        if (isPlateEmpty())
            return;
        if (appetite > plateCapacity) {
            plateCapacity = 0;
        } else
            this.plateCapacity -= appetite;
    }

    boolean isPlateEmpty() {
        return plateCapacity == 0;
    }


    public void addPlateCapacity(int capacity) {
        plateCapacity += capacity;
    }

    int getPlateCapacity() {
        return plateCapacity;
    }




    @Override
    public String toString() {
        return "Внестимость тарелки: " + plateCapacity;
    }


}
