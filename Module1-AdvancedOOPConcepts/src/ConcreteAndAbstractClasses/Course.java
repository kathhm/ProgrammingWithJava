package ConcreteAndAbstractClasses;

abstract class Course {
    Subject subject;
    String instructor;
    int fee;
    int assignmentMarks;
    int quizMarks;

    Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;
    }
}
