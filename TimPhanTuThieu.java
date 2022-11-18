package pk1;

import java.util.Scanner;

public class TimPhanTuThieu {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Nhập số phần tử:");
        //int n = scanner.nextInt();

        // Tính tổng chuỗi số tự nhiên từ 1-n


        int n = 20;
        int A[] = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int a = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        System.out.println("Số còn thiếu là :" + (a - sum));

    }
}
