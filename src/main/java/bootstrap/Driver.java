package bootstrap;

import domain.*;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    private static void displayStudent(ArrayList<Student> StudentList) {
        System.out.println("Wizardry Results :\n");
        for (int i =0; i < StudentList.size(); i++){
            Student student = StudentList.get(i);
            System.out.println("Name: " + student.getStudentName() + ", Marks: " + student.getMarks()
            + " and Roll No: " + student.getRollno());
        }
    }
    private static void displayBroom(ArrayList<Broom> broomList) {
        System.out.println("Inventory :\n");
        for (int i =0; i < broomList.size(); i++){
            Broom broom = broomList.get(i);
            System.out.println("Name: " + broom.getBrandName() + " " + broom.getVersion()
                    + " and Max speed: " + broom.getMaxSpeed());
        }
    }

    public static void main(String[] args){
        System.out.println("STUDENTS");
        ArrayList<Student> StudentList = new ArrayList<>();


        StudentList.add(new Student("LOUKIK","Wizardry",98,1));
        StudentList.add(new Student("RAMU","Wizardry",99,2));
        StudentList.add(new Student("SHAMU","Wizardry",92, 3));
        StudentList.add(new Student("ROHAN","Wizardry", 99, 4));

        System.out.println("Before Sorting: ");
        displayStudent(StudentList);
        Collections.sort(StudentList);
        System.out.println("\nAfter Sorting: ");
        displayStudent(StudentList);


        System.out.println("\n----------------------------------------------------");
        System.out.println("BROOMS");

        ArrayList<Broom> broomList = new ArrayList<>();


        broomList.add(new Broom("Nimbus",1200,1700));
        broomList.add(new Broom("Nimbus",1500,2001));
        broomList.add(new Broom("Oakshaft",1200,79));
        broomList.add(new Broom("Comet",1100, 290));

        System.out.println("Before Sorting: ");
        displayBroom(broomList);
        Collections.sort(broomList);
        System.out.println("\nAfter Sorting: ");
        displayBroom(broomList);

    }
}
