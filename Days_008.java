package Package;

import java.util.Scanner;

public class Days_008 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan nama yg ingin di tebak:");
    String nama_aktual = sc.nextLine();
    boolean cek = true;

    while (cek) {

    System.out.print("Masukkan nama :");
    String guess = sc.next();
    System.out.println("");
        
        if (guess.equals(nama_aktual)) {
            System.out.println("Tebakan benar");
            System.out.println("Nama ,"+guess);
            System.out.println("Selamat !!");
            cek=false;
        }else{
            System.out.println("Tebakan salah, isi lagi");
    
        }
    }

    
}
}
