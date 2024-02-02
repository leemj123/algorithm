package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1152 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.charAt(0) == ' ')
            s = s.substring(1);
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (s.charAt(s.length()-1) == ' ')
            s = s.substring(0,s.length()-1);

        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count++;
        }
        System.out.println(count);
    }

}
