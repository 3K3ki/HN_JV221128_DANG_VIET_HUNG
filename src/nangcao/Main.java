package nangcao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

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
                    if (studentList.size() == 0) {
                        System.out.println("Không có student trong list");
                    } else {
                        for (Student student : studentList) {
                            System.out.println("Student ID: " + student.getStudentId());
                            System.out.println("Student Name: " + student.getStudentName());
                            System.out.println("Age: " + student.getAge());
                        }
                    }
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
                    studentList.add(student);
                    System.out.println("Student Thêm thành công!");

                    break;
                case 3:
                    Scanner inp = new Scanner(System.in);

                    System.out.println("Nhập id student cần sửa:");
                    int studentFix = input.nextInt();
                    inp.nextLine();
                    System.out.println("Nhập student name:");
                    String studentNameFix = inp.nextLine();
                    System.out.println("Nhập student age:");
                    int ageFix = inp.nextInt();
                    
                    break;
                case 4:
                    System.out.println("Nhập id student để xóa:");
                    int studentDel = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getStudentId() == studentDel) {
                            studentList.remove(i);
                            System.out.println("Xóa thành công!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không có !");
                    }
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
