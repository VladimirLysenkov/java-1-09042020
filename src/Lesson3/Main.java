package Lesson3;

import java.util.Scanner;

public class Main {

    //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        do {
            guessNumber();
            System.out.println("\nПоиграем еще раз? 1 – да / 0 – нет.");
        } while (1 == scanner.nextInt());


    }


    private static void guessNumber() {
        int attemptsCountMax = 3;
        int minLimit = 0;
        int maxLimit = 9;
        int randomNumber = (int) (Math.random() * maxLimit);
        int attemptsLeft = attemptsCountMax;
        int userNumber;

        System.out.printf("Угадайте целое число от %d до %d. ", minLimit, maxLimit);

        do {
            System.out.printf("Попыток: %d\n", attemptsLeft);
            userNumber = scanner.nextInt();
            String message;

            if (userNumber > randomNumber) {
                message = "Не угадали. Число меньше. ";
            } else if (userNumber < randomNumber) {
                message = "Не угадали. Число больше. ";
            } else {
                message = "Угадали!";
            }

            System.out.print(message);
        } while (userNumber != randomNumber && --attemptsLeft > 0);
    }

}
