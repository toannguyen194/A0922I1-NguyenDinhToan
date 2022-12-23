package array;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for ( int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập số phần tử của mảng 2: ");
        int k = scanner.nextInt();
        int array2[] = new int[n];
        for ( int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int arrayNew[] = new int[array.length+array2.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        for (int i = array.length; i <arrayNew.length ; i++) {
            arrayNew[i] = array2[i-array.length];
        }
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i]+" ");
        }
    }
}
