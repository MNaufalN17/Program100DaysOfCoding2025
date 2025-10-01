package Package;

import java.util.Scanner;

public class Days_024 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double phi=0;
    double luas;

    System.out.print("Masukkan jari-jari : ");
    double r = sc.nextInt();

    if(r%7==0){
        phi = 22.0/7.0;
        
    }else{
        phi = 3.14;
    }
    luas = phi * r*r;
    System.out.println("Luas lingkaran dengan jari-jari "+r+" adalah : "+luas);

}
}
