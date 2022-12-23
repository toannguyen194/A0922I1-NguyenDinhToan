package array;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for ( int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập số phần tử cần chèn:");
        int numInsert = scanner.nextInt();
        int indexNum;
        do {
            System.out.println("Nhập vị trí cần chèn:");
            indexNum = scanner.nextInt();
            if (indexNum >= 0 && indexNum < array.length){
                break;
            }
        }while (true);

        for (int i = array.length-1; i > indexNum ; i--) {
            array[i]=array[i-1];
        }
        array[indexNum] = numInsert;
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}


