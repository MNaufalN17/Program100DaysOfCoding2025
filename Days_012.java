package Package;

import java.util.Scanner;

public class Days_012 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("========Input Biodata========");
    System.out.print("Masukkan Nama :");
    String nama = scanner.nextLine();
    System.out.print("Masukkan Alamat :");
    String alamat = scanner.nextLine();
    System.out.print("Masukkan Umur :");
    int umur = scanner.nextInt();
    System.out.println("========Biodata Anda========");
    System.out.println("Nama : " + nama);
    System.out.println("Alamat : " + alamat);
    System.out.println("Umur : " + umur + " Tahun");
    scanner.close();


}
}
