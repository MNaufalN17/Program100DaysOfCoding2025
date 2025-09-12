package Package;

public class Days_005 {
public static void main(String[] args) {
    byte databyte = 127;
    short datashort = 3333;
    int dataint = 12233;
    long datalong = 2123123412l;

    byte max = Byte.MAX_VALUE;
    byte min = Byte.MIN_VALUE;

    short maxshort = Short.MAX_VALUE;
    short minshort = Short.MIN_VALUE;

    int maxint = Integer.MAX_VALUE;
    int minint = Integer.MIN_VALUE;

    long maxlong = Long.MAX_VALUE;
    long minlong = Long.MIN_VALUE;

    System.out.println("Byte :"+databyte);
    System.out.println("Short :"+datashort);
    System.out.println("Integer :"+dataint);
    System.out.println("Long :"+datalong);

    System.out.println("Byte min :"+databyte);
    System.out.println("Byte max :"+databyte);

    System.out.println("Short min :"+minshort);
    System.out.println("Short max :"+maxshort);

    System.out.println("Integer min :"+minint);
    System.out.println("Integer max :"+maxint);

    System.out.println("Long min :"+minlong);
    System.out.println("Long max :"+maxlong
    
    );
}
}
