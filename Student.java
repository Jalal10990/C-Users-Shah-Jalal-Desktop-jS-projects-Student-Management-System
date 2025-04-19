import java.util.Scanner;

class Student{
    private String name;
    private int rollNo;
    private String course;

    //constructor
    Student(String name, int rollNo, String course){
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    //display student info
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
    //Getter for rollNO
    public int getRollNo(){
        return rollNo;
    }
}