package BeakJon.twoarray;

import java.io.*;
import java.util.StringTokenizer;

public class BJ2738 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int colum = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int [][] arr = new int [colum*2] [row];

        for (int i = 0; i < colum*2; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < row; j++) {
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        for (int i = 0; i < colum; i++) {
            for ( int j = 0; j <row; j++){
                bw.write((arr[i][j] + arr[i+colum][j])+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
