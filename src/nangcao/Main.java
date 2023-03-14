package nangcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập SudentId: ");
        int studentId = input.nextInt();
        System.out.println("Nhập tuổi: ");
        int age = input.nextInt();
        System.out.println("Nhập Tên Student: ");
        String studentName = input.nextLine();

        Student student = new Student(studentId,studentName, age);

        int choice = 0;
        while (choice != 4) {
            System.out.println("***************STUDENT MANAGE***************************");
            System.out.println("1.  Show List Student.");
            System.out.println("2. Create Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student ");
            System.out.println("5.  Sort Student By Age ASC (Tăng Dần). ");
            System.out.println("6.exit ");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    student.getListStudent();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Không có , nhập lại");
                    break;
            }
            System.out.println("\n---------");
        }
    }
}
