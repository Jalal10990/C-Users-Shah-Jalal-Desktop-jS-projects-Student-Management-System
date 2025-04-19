import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner j1 = new Scanner(System.in);
        Student[] students = new Student[5];

        int count = 0;

        while(true){
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = j1.nextInt();
            switch(choice){
                case 1:
                if(count < students.length){
                    j1.nextLine();
                    System.out.println("Enter name: ");
                    String name = j1.nextLine();
                    System.out.println("Enter roll number: ");
                    int roll = j1.nextInt();
                    j1.nextLine();
                    System.out.print("Enter course: ");
                    String course = j1.nextLine();

                    students[count] = new Student(name, roll, course);
                    count++;
                    System.out.println("Student added!");
                } else {
                    System.out.println("Maximum student limit reached.");
                }
                break;

                case 2:
                for(int i = 0; i< count; i++){
                    System.out.println("/nStudent " + (i+1) + ":");
                    students[i].displayInfo();
                }
                break;

                case 3:
                System.out.println("Enter roll number to search: ");
                int searchRoll = j1.nextInt();
                boolean found = false;

                for(int i = 0; i < count; i++){
                    if(students[i].getRollNo() == searchRoll){
                        System.out.println("Student found:");
                        students[i].displayInfo();
                        found = true;
                        break;
                    }            
                }

                if(!found){
                    System.out.println("Student not found.");
                }
                break;
                case 4:
                System.out.println("Exiting..");
                System.exit(0);

                default:
                System.out.println("Invalid choice.");
                }
            }
        }
    }

