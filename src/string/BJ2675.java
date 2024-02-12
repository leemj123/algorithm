package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2675 {
    public void solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            String p ="";
            for ( int i = 0; i < S.length(); i++) {
                p += String.valueOf(S.charAt(i)).repeat(R);
            }
            System.out.println(p);

            T -= 1;
        }
    }
}
