package season1.UCLN;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        a = Math.abs(a);
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        b = Math.abs(b);

        if (a==0 && b!=0){
            System.out.print("UCLN la b");
        } else {
            System.out.print("UCLN la a");
        }
        while (a!=b){
            if (a<b){
                b = b - a;
            } else {
                a = a - b;
            }
        }
        System.out.print("UCLN la "+a );


    }
}
