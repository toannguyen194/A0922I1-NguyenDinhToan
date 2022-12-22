package loop;

import javax.swing.*;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        int width;
        int heith;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter heith: ");
                    heith = input2.nextInt();
                    System.out.print("Enter width: ");
                    width = input2.nextInt();
                    for (int i = 1; i <= heith; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println(" ");

                    }
                case 2:
                    System.out.print("Enter heith: ");
                    heith = input2.nextInt();

                    for (int i = 1; i <= heith; i++) {
                        for (int j = i; j <= heith; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("picture 2 ");
                    for (int i = 1; i <= heith; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println(" ");

                    }
                case 3:

            }
        }
    }
}

