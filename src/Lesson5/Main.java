package Lesson5;

public class Main {

    public static void main(String[] args){


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Sergey", "Petrovich","Plotnik", "ivanovsergey@mail.ru","89617845745", 50000, 30);
        employees[1] = new Employee("Petrov", "Petr", "Ivanovich","Manager", "petrovpp@mail.ru","89617834745", 20000, 41);
        employees[2] = new Employee("Sidorova", "Polina","Petrovna", "Stroitel","sidorova@mail.ru", "89656834745", 35000, 35);
        employees[3] = new Employee("Fedirov", "Ivan", "Vladimirivich","Programmer","fedorov@mail.ru", "89678834745", 870000, 36);
        employees[4] = new Employee("Pushkin", "Semen","Petrovich", "Manager","pushkin@mail.ru", "89123434745", 120000, 45);

        for (Employee e : employees) if (e.getEmployeeAge() > 40) e.getEmployeeInfo();

    }








}
