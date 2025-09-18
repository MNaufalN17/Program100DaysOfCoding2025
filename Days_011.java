package Package;

import java.util.Scanner;

public class Days_011 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan data String :");
    String data = sc.nextLine();
    System.out.print("Masukkan Data Byte : ");
    byte data1 = sc.nextByte();
    System.out.print("Masukkan Data Short :");
    short data3 = sc.nextShort();
    System.out.print("Masukkan Data Integer :");
    int data2 = sc.nextInt();
    System.out.print("Masukkan Data Long :");
    long data4 = sc.nextLong();
    System.out.print("Masukkan Data Float :");
    float data5 = sc.nextFloat();
    System.out.print("Masukkan Data Double :");
    double data6 = sc.nextDouble();
    System.out.print("Masukkan Data Char :");
    char data8 = sc.next().charAt(0);
    String a = sc.nextLine();
    System.out.print("Masukkan Data Boolean :");
    boolean data7 = sc.nextBoolean();

    System.out.println("Data String :"+data);
    System.out.println("Data Byte :"+data1); 
    System.out.println("Data Short :"+data3);
    System.out.println("Data Integer :"+data2);
    System.out.println("Data Long :"+data4);
    System.out.println("Data Float :"+data5);
    System.out.println("Data Double :"+data6);
    System.out.println("Data Boolean :"+data7);
    sc.close();


    
}
}
