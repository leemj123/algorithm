package BeakJon.harder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {
    public void solution() throws IOException {
        //dz= 문자열이 3글자 임을 주의
        String[] cros = new String[] {"c=","c-","dz=","d-","lj","nj","s=","z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();

        for (String cro : cros) {
            if (s.contains(cro)) {
                s = s.replace(cro, " ");
            }
        }
        System.out.println(s.length());
    }
}
