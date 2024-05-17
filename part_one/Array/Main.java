package part_one.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte maxSize = 5;
        int action;
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager(maxSize);

        do {
            System.out.println("*** Choose the action to perform ***");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            action = getAction();

            switch (action) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.searchStudent();
                    break;
                case 3:
                    manager.deleteStudent();
                    break;
                case 4:
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Ending student manager");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (action != 5);

    }

    /** Get the action the user wants to perform. */
    private static int getAction(){
        int action = 0;

        do {
            try {
                System.out.print("Enter your choice: ");
                Scanner scanner=new Scanner(System.in);
                action = scanner.nextInt();
            }catch (Exception ignored){}
        }while (action == 0);
        return action;
    }
}