package part_one.Array;

import java.util.Scanner;

public class StudentManager {
    private final String[] students;
    private final byte maxSize;
    private int currentSize = 0;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager(byte maxSize) {
        this.students = new String[maxSize];
        this.maxSize = maxSize;
    }

    /** Add a student. */
    public void addStudent(){
        String student = this.getUserInput("Enter the student name");
        if(students.length == currentSize){
            System.out.println("Student manager is full");
            return;
        }
        this.students[currentSize++] = student;
        System.out.println("Student added successfully");
    }

    /** Search for a student by name */
    public void searchStudent(){
        String name = this.getUserInput("Enter the student name to search");
        for(String student: this.students){
            if(student != null && student.equals(name)){
                System.out.println("Student found: " + student);
            }
        }
        System.out.println("No student found");
    }

    /** Delete a user by name */
    public void deleteStudent(){
        String student = this.getUserInput("Enter the student name");
        int studentIndex = this.getStudentIndex(student);
        if(studentIndex == -1){
            System.out.println("Student does not exist");
        }

        for(int i = studentIndex; i< maxSize -1; i++){
            this.students[i] = this.students[i + 1];
        }
        currentSize --;
        System.out.println("Student deleted successfully");
    }

    /** Display all the students currently stored in memory */
    public void displayStudents(){
        if(this.currentSize == 0){
            System.out.println("Kindly add some students to display");
            return;
        }
        System.out.println("**** Printing all students *****");
        for(String student: this.students){
            if(student != null){
                System.out.println(student);
            }
        }
    }

    /** Helper function to get the student index by name */
    private int getStudentIndex(String name){
        for(int i = 0; i < students.length; i++){
            String student = this.students[i];
            if(student != null && student.equals(name)){
                return i;
            }
        }
        return -1;
    }

    /** Get user input */
    private String getUserInput(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}