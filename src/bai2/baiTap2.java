package bai2;

import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Nhâp số n:");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng tất cả số chẵn trong khoảng từ 0 đến "+n+" là : "+sum);
    }
}
