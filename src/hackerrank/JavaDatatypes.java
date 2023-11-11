package hackerrank;

import com.sun.jdi.ByteValue;

import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                long sizeByte = x;
                System.out.println(x + " can be fitted in:");
                if(sizeByte >= -128 && sizeByte <= 127) System.out.println("* byte");
                if(sizeByte >= -32768 && sizeByte <= 32767) System.out.println("* short");
                if(sizeByte >= -2147483648 && sizeByte <= 2147483647) System.out.println("* int");
                if(sizeByte >= -9223372036854775808L) System.out.println("* long");
            } catch(Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

}
