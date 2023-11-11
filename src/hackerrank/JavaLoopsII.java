package hackerrank;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int resultI = 1;
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int ni = 0; ni < n; ni++) {
                int s = a + resultI * b;
                for (int r = 0; r < ni; r++) {
                    resultI = (resultI + resultI);
                    s += resultI * b;
                }
                resultI = 1;
                System.out.print(s + " ");
            }
            System.out.println();
        }
        in.close();
    }

}
