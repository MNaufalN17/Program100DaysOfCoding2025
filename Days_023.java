package Package;

import java.util.Scanner;

public class Days_023 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang : ");
    int panjang = sc.nextInt();
    System.out.print("Masukkan lebar :");
    int lebar = sc.nextInt();

    System.out.println("Luas : "+(lebar*=panjang));
}
}
