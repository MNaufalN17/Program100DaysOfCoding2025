package Package;


public class Days_014 {
public static void main(String[] args) {
    String DATASTRING1 = "123";
    String DATASTRING2 = "12345";
    String DATASTRING3 = "123456";
    String DATASTRING4 = "STRING";
    
    //NUMERIK BILANGAN BULAT
    byte KONVERSI_STRING1 = Byte.parseByte(DATASTRING1);
    System.out.println(KONVERSI_STRING1);
    int KONVERSI_STRING2 = Integer.parseInt(DATASTRING2);
    System.out.println(KONVERSI_STRING2);
    short KONVERSI_STRING3 = Short.parseShort(DATASTRING2);
    System.out.println(KONVERSI_STRING3);
    long KONVERSI_STRING4 = Long.parseLong(DATASTRING3);
    System.out.println(KONVERSI_STRING4);

    //NUMERIK BILANGAN PECAHAN
    float KONVERSI_STRING5 = Float.parseFloat(DATASTRING3);
    System.out.println(KONVERSI_STRING5);
    double KONVERSI_STRING6 = Double.parseDouble(DATASTRING3);
    System.out.println(KONVERSI_STRING6);

    //TIPE KARAKTER
    char KONVERSI_STRING7 = DATASTRING4.charAt(2);
    System.out.println(KONVERSI_STRING7);

    //TIPE BOOLEAN
    boolean KONVERSI_STRING8 = Boolean.parseBoolean(DATASTRING4);
    System.out.println(KONVERSI_STRING8);
}
}
