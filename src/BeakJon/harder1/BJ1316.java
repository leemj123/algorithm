package BeakJon.harder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1316 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;

        while (n > 0) {
            int[] copy = new int[26];
            String s = br.readLine();
            int temp = -1;

            for (int i =0; i < s.length(); i++) {
                int target = s.charAt(i)-97;
                if (temp == target) {
                    continue;
                }
                else if (copy[target] == 1) {
                    result--;
                    break;
                }
                else {
                    copy[target] = 1;
                    temp = target;
                }
            }
            n--;
        }
        System.out.println(result);
    }
}
