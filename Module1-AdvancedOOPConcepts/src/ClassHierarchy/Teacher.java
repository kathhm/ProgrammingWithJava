package ClassHierarchy;


public class Teacher extends Employee{

    String name;
    Date dob;
    Date dateOfAppointment;
    String subject;
    String qualification;
    int salary;

    public Teacher(String name, Date dobOfTeacher, Date dobOfAppointment, String qualification, String subject) {
        this.name = name;
        this.dob = dobOfTeacher;
        this.dateOfAppointment = dobOfAppointment;
        this.subject = subject;
        this.qualification = qualification;
    }

    @Override
    public void getDetails() {
    System.out.println("Name of Teacher: " + this.name);
    System.out.println("Date of Birth: " + this.dob.getDate());
    System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
    System.out.println("Subject: " + this.subject);
    System.out.println("Qualifications: " + this.qualification);
    System.out.println("Salary: " + this.getSalary());
    }

    @Override
    public void setSalary(int sal){
        this.salary = sal;
    }       

    @Override
    public int getSalary(){
        return this.salary;
    }

}