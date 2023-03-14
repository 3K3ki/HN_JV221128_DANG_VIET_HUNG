package bai3;

import java.util.Random;
import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[50];
        int chon = 0;
        int number;
        int count = 0;
        System.out.println("Nhập 1 mảng gồm 50 phần tử ngẫu nhiên từ 1-100 : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        while (chon != 4) {
            System.out.println("MENU");
            System.out.println("1. In mảng");
            System.out.println("2. Tìm min,max");
            System.out.println("3. Sắp xếp mảng tăng dần và in mảng sau khi sắp xếp");
            System.out.println("4. Đếm số lần xuất hiện các số nguyên tố trong mảng ");
            System.out.println("5.exit ");
            System.out.print("Enter your choice: ");

            chon = input.nextInt();
            switch (chon) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    break;
                case 2:
                    int min = array[0], max = array[0];
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > max) {
                            max = array[i];
                        }
                    }
                    System.out.println("Giá trị lớn nhất trong mảng: " + max);
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] < min) {
                            min = array[i];
                        }
                    }
                    System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
            System.out.println("\n---------");
        }
    }
}


