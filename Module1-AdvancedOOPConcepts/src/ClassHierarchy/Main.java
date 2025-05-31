package ClassHierarchy;

public class Main {

    public static void main(String[] args) {

        Date dobOfStudent = new Date(1, 1, 2005); 
        Date dobOfTeacher = new Date(10, 10, 1995); 
        Date dobOfAppointment = new Date(1, 4, 2024); 


        Teacher teacher = new Teacher("Madhavan", dobOfTeacher, dobOfAppointment, "MTech", "Electronics");
        teacher.setSalary(50000);
        Student student = new Student("Alice", dobOfStudent, teacher, "Computer Science");

        teacher.getDetails();
        student.getDetails();
        



     

        
    }
    
}
