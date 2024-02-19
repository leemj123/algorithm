package BeakJon.harder1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BJ2444 {
    public void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();

        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                bw.write(" ".repeat(n - i) + "*".repeat(i * 2 - 1) + "\n");
            } else {
                bw.write(" ".repeat(i - n) + "*".repeat((2 * n - i) * 2 - 1) + "\n");
            }
        }
        bw.flush();
    }
}