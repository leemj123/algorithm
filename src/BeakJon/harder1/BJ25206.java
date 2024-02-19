package BeakJon.harder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ25206 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectsCount = 20;
        float totalScoreSum = 0.f;
        float totalCredits = 0.f;

        for (int i = 0; i < subjectsCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            float credits = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                float score = switchScore(grade);
                totalScoreSum += credits * score;
                totalCredits += credits;
            }
        }

        float gpa = totalScoreSum / totalCredits;
        System.out.printf("%.6f\n", gpa);
    }

    private static float switchScore(String grade) {
        switch (grade) {
            case "A+": return 4.5f;
            case "A0": return 4.0f;
            case "B+": return 3.5f;
            case "B0": return 3.0f;
            case "C+": return 2.5f;
            case "C0": return 2.0f;
            case "D+": return 1.5f;
            case "D0": return 1.0f;
            case "F": default:
                return 0.0f;
        }
    }
}
