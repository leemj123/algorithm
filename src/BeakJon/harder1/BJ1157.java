package BeakJon.harder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1157 {
    public void solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];

        for ( int i = 0; i<s.length(); i++) {
            if (s.charAt(i) < 97)
                arr[s.charAt(i)-65] += 1;
            else
                arr[s.charAt(i)-97] += 1;
        }

        int result = -1;
        int max = -1;
        boolean duple = false;

        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] > max ) {
                result = i;
                max = arr[i];
                duple = false;
            }
            else if (arr[i] == max)
                duple = true;
        }

        if ( duple )
            System.out.println("?");
        else
            System.out.println((char)(result+65));
    }
}
