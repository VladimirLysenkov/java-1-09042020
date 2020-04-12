package Lesson2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array1);
        System.out.println("Инвертированный массив: " + Arrays.toString(array1));

        int[] array2 = new int[8];
        fillArray(array2);
        System.out.println("Заполненный массив: " + Arrays.toString(array2));


    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }



}
