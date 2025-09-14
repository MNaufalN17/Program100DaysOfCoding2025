package Package;

import java.util.Scanner;

public class Days_007 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean status;
    String ulang;
    boolean deteksi=true;
    
    while (deteksi) {
        
    System.out.print("Masukkan Inisial:");
    char inisial =sc.nextLine().charAt(0);
    System.out.println("Sudah Menikah? y/n");
    String kondisi =sc.nextLine();
    System.out.println("Inisial :"+inisial);
    System.out.print("Status Pernikahan :");
    if (kondisi.equalsIgnoreCase("y")) {
        status = true;
    }else{
        status = false;
    }

    System.out.println(status);

    System.out.print("Ingin lagi? y/n ");
    String lagi = sc.nextLine();
    if (lagi.equalsIgnoreCase("y")) {
        deteksi=true;
    }else{
        deteksi=false;
        System.out.println("Terima Kasih :D");
    }
    

}
    // boolean sudah_menikah =false;
    // boolean belum_menikah =true;
    // System.out.println("Inisial :"+inisial);
    // System.out.println("Sudah Menikah:"+sudah_menikah);
    // System.out.println("Belum Menikah:"+belum_menikah);
}
}
