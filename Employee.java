package lesson5;

import javax.naming.Name;

public class Employee {
    private String Name;
    private String Profession;
    private String email;
    private String Telephone;
    private String Salary;
    private String Age;

    public Employee(String name, String profession, String email, String telephone, String salary, String age ) {
        this.Name = name;
        this.Profession = profession;
        this.email = email;
        this.Telephone = telephone;
        this.Salary = salary;
        this.Age = age;
    }
    public Employee() {

    }

    public void printInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Profission: " + Profession);
        System.out.println("email: " + email);
        System.out.println("Telefon: " + Telephone);
        System.out.println("Salary: " + Salary);
        System.out.println("Age: " + Age);

    }

}