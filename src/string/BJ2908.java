package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2908 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num1 = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
        sb.setLength(0);
        int num2 = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());

        System.out.println(num1 > num2 ? num1 : num2);

    }
}
