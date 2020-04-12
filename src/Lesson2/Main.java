package Lesson2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array1);
        System.out.println("Инвертированный массив: " + Arrays.toString(array1));
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }






}
