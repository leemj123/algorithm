package BeakJon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ5622 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<Integer> numList = new ArrayList<>();
        for ( int i =0; i < s.length(); i++ ) {
            switch (s.charAt(i)) {
                case 65: case 66: case 67:
                    numList.add(2);
                    break;
                case 68: case 69: case 70:
                    numList.add(3);
                    break;
                case 71: case 72: case 73:
                    numList.add(4);
                    break;
                case 74: case 75: case 76:
                    numList.add(5);
                    break;
                case 77: case 78: case 79:
                    numList.add(6);
                    break;
                case 80: case 81: case 82: case 83:
                    numList.add(7);
                    break;
                case 84: case 85: case 86:
                    numList.add(8);
                    break;
                case 87: case 88: case 89: case 90:
                    numList.add(9);
                    break;
            }
        }
        int result = 0;
        for (int i : numList) {
            result += 2 + (i-1);
        }
        System.out.println(result);
    }
}
