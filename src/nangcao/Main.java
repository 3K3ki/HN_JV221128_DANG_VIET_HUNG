package nangcao;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
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

                    break;
                case 2:
                    System.out.println("Nhập student ID:");
                    Scanner scanner = new Scanner(System.in);
                    int studentId = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Nhập student name:");
                    String studentName = scanner.nextLine();

                    System.out.println("Nhập student age:");
                    int age = scanner.nextInt();

                    Student student = new Student(studentId, studentName, age);

                    System.out.println("Student Thêm thành công!");

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Nhập id student để xóa:");
                    int studentDel = input.nextInt();

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
