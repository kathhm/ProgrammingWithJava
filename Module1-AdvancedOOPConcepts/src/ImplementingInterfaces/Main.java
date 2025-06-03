package ImplementingInterfaces;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ranjan", 20, "Electronics", 75);
        student.getDetails();
        student.result();
        student.fee(5000);

        Employee employee = new Employee("Steve", 35, 50000);
        employee.getDetails();
        employee.computeSalary();
        employee.computeTax();
    }
}