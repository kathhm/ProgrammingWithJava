package ClassHierarchy;
public abstract class Employee extends Person {
    
    Date dateOfAppointment;
    int salary;

    public Employee() {}

   public abstract void setSalary(int sal);
   public abstract int getSalary();
}
