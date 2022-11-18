package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


      //Employee1.Name = "TOM";
      //Employee2.Profession = "Engineer";
      //Employee3.email = "cat@cat.ru";

       // System.out.println(Employee1.Name);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (Employee employee: employees)
            employee.printInfo();

       // employee1.printInfo();
       // employee2.printInfo();
       // employee3.printInfo();
       // employee4.printInfo();
       // employee5.printInfo();


    }

}
