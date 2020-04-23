package Lesson5;

public class Employee {
    private String lastname;
    private String firstname;
    private String middlename;
    private String post;
    private String email;
    private String phone;
    private int salary, age;


    public Employee(String lastname, String firstname, String middlename, String post, String email, String phone, int salary, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    public void getEmployeeInfo() {
        System.out.println(
                "\n lastname: " + lastname
                + "\n firstname: " + firstname
                + "\n middlename: " + middlename
                + "\n post: " + post
                + "\n email: " + email
                + "\n salary: " + salary
                + "\n age: " + age);
    }


    public int getEmployeeAge() {
        return age;
    }

}
