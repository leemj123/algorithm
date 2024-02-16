package BeakJon.string;

import java.io.*;
import java.util.Arrays;

public class BJ10809 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alpaArr = new int[26];
        Arrays.fill(alpaArr, -1);

        String s = br.readLine();
        for ( int i = 0 ; i <s.length();i++) {
            int a = s.charAt(i)-97;
            if ( alpaArr[a] == -1) {
                alpaArr[a] = i;
            }
        }
        for ( int a : alpaArr){
            bw.write(a +" ");
        }
        bw.flush();
    }
}
