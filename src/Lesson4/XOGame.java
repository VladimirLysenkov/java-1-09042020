package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class XOGame {
    static final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static  char [] [] map;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    private static final int TO_WIN = 3;

    public static void main (String[] args){
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isFuelFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isFuelFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        boolean isCheckedDiagB, isCheckedDiagS;
        isCheckedDiagB = isCheckedDiagS = true;

        for (int diag = 0; diag < SIZE; diag++) {
            boolean isRow, isCol;
            isRow = isCol = true;

            for (int i = 0; i < SIZE; i++) {
                isRow = (map[diag][i] == symb) && isRow;
                isCol = (map[i][diag] == symb) && isCol;
                if (i == diag) {
                    isCheckedDiagB = (map[diag][diag] == symb) && isCheckedDiagB;
                    isCheckedDiagS = (map[diag][SIZE - 1 - diag] == symb) && isCheckedDiagS;
                }
            }

            if (isRow || isCol) return true;
        }

        return isCheckedDiagB || isCheckedDiagS;
    }

    public static boolean isCellValid (int y, int x){
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }


    public static boolean isFuelFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i] [j] = DOT_EMPTY;
            }
        }

    }

    public  static  void  printMap (){
        //    System.out.print("  ");
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%s  ", map[i][j]);
            }
            System.out.println();
        }

    }
}
