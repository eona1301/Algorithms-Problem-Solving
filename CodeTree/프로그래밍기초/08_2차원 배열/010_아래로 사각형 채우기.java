import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 아래로 사각형 채우기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/filling-rectangle-with-downflow/description
 * 2. 풀이핵심
 *  - 2차원 배열과 패턴
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[][] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ARR = new int[N][N];

        int num = 0;
        for (int n = 0;n < N;n++)
            for (int m = 0;m < N;m++)
                ARR[m][n] = ++num;
        
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}