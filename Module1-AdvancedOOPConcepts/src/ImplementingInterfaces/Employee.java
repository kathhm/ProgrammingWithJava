package ImplementingInterfaces;
class Employee extends Person implements EmployeeInterface{
    int basicPay;
    Employee(String name, int age, int basic) {
        this.name = name;
        this.age=age;
        this.basicPay = basic;
    }
    @Override
    public double computeSalary() {
        double salary;
        salary = this.basicPay+this.basicPay*0.50;
        //Salary computation logic
        return salary;
    }
    @Override
    public double computeTax() {
        return this.basicPay*0.10;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Basic Pay: "+this.basicPay);
        System.out.println("Salary: "+this.computeSalary());
        System.out.println("Tax: "+ this.computeTax());
    }
}
