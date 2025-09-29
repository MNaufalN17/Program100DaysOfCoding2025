package Package;

import java.io.BufferedReader;
import java.util.Scanner;

public class Days_022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Program Persegi--------");
        boolean repeat = true;
        while(repeat){
        System.out.print("Masukkan sisi :");
        int sisi = sc.nextInt();
        int luas = sisi*sisi;
        sc.nextLine();

        System.out.println("Luas persegi dengan sisi "+sisi+", adalah :"+luas);
        System.out.print("Ingin lagi? y/n:");
        String status =sc.nextLine();
        if (status.equalsIgnoreCase("y")) {
            repeat=true;
        }else{
            repeat=false;
        }
        }
        System.out.println("Terimakasih:D");
        System.out.println("--------------");
    }
}
