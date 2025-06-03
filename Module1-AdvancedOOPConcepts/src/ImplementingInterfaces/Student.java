package ImplementingInterfaces;

class Student extends Person implements StudentInterface {
    String subject;
    int marks;

    Student(String name, int age, String subject, int marks) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    void getDetails() {
        super.getDetails();
        //print subject and marks
        System.out.println("Subject: "+this.subject);
        System.out.println("Marks: "+this.marks);
    }

    @Override
    public void result() {
        //print Pass if marks>50, fail otherwise
        if (this.marks>=50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    @Override
    public void fee(int fee) {
        System.out.println("Student pays the fees "+fee);
    }
}