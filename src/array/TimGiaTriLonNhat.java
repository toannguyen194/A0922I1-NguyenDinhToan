package array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang trong mang");
        int n = scanner.nextInt();
        System.out.println("Nhap do dai cua hang trong mang");
        int k = scanner.nextInt();
        int array[][] =new int[n][k];
        for (int i =0 ; i <n ; i++) {
            for (int j = 0; j <k ; j++) {
                System.out.println("Nhap mang: ");
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Array: "+ Arrays.deepToString(array));
        int max=array[0][0];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <k ; j++) {
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat la: "+max);
    }
}
