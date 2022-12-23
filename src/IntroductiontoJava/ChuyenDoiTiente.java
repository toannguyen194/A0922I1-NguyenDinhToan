package IntroductiontoJava;
import java.util.Scanner;
public class ChuyenDoiTiente {
    public static void main(String[] args) {
        double Vnd =23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền Usd: ");
        usd=sc.nextDouble();
        double quydoi=usd*23000;
        System.out.print("Giá tri VND: "+quydoi);

    }
}

