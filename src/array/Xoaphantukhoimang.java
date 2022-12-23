package array;

import java.util.Scanner;

public class Xoaphantukhoimang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,c;
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for ( i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên muốn xóa:");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
