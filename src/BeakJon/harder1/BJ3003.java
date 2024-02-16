package BeakJon.harder1;

import java.io.*;
import java.util.StringTokenizer;

public class BJ3003 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {1,1,2,2,2,8};
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] - Integer.parseInt(st.nextToken()) + " ");
        }
        bw.flush();
    }
}
