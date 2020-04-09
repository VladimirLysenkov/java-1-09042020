public class MainClass {
    public static void main(String[] args) {

        byte p = 124;
        short o = 1223;
        int i = 3432423;
        long u = 65436546L;
        float y = 45.34F;
        double t = 3.141;
        char r = '$';
        boolean e = true;

        printHelloWorld();
        System.out.println(calculation (4,2,6,2));
        System.out.println(task10and20(2, 12));
        isPositiveOrNegativeNumber(7);
        System.out.println(isInteger(-6));
        printString("Вася");
        isLeapYear(2020);

    }


    // метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float calculation(float a, float b, float c, float d) {
        return a * (b + (c / d));

    }

    // метод для вывода строки Hello World
    static void printHelloWorld(){

        System.out.println("Hello World");
    }

    // метод принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean task10and20(int x1, int x2){
        return (x1 + x2) > 10 && (x1 + x2) <= 20;
    }

    // метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное
    public static void isPositiveOrNegativeNumber(int n1){
        if (n1 >= 0) System.out.println(n1 + " - Положительное число");
        else System.out.println(n1 +" - Отрицательное число");
    }

    // метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.
    public static boolean isInteger(int b1){
        return b1 < 0;
    }

    // метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void printString(String name){
        System.out.println("Привет, " + name + "!");
    }

    // метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println(year + " високосный год");
        else System.out.println(year + " не високосный год");
    }
}
