package BeakJon.harder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10988 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num =1;
        String s = br.readLine();
        if (s.length()%2 == 0) {
            for (int i = 0; i <s.length()/2; i++) { //짝수
                if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                    num =0;
                    break;
                }
            }
        }else {
            for (int i = 0; i < (s.length()-1)/2 ; i++) {
                if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                    num =0;
                    break;
                }
            }
        }
        System.out.println(num);
    }
}
