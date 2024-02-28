package BeakJon.twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2566 {
    public void solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int MAX = Integer.MIN_VALUE;
        int maxI = -1;
        int maxJ = -1;

        for (int i =0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <9; j++) {
                int value = Integer.parseInt(st.nextToken());
                if ( value > MAX ) {
                    MAX = value;
                    maxI = i+1;
                    maxJ = j+1;
                }
            }
        }
        System.out.println(MAX + "\n" + maxI + " " + maxJ);
    }
}
