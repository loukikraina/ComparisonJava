package domain;

public class Student implements Comparable{
    private String studentName;
    private String subject;
    private int marks;
    private int rollno;




    public Student(String studentName, String subject, int marks, int rollno){
        this.studentName=studentName;
        this.subject=subject;
        this.marks=marks;
        this.rollno=rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public String getStudentName() {
        return studentName;
    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
    public String getSubject() {
        return subject;
    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }

    public int getMarks() {
        return marks;
    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }



    @Override
    public int compareTo(Object o) {
        Student studentCompared = (Student) o;
        if(marks > studentCompared.getMarks()){
            return -1;
        }
        else if(marks < studentCompared.marks){
            return 1;
        }
        else {
            if (studentName.compareToIgnoreCase(studentCompared.getStudentName())>0){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}
