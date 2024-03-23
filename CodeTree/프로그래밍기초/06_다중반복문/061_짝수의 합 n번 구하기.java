import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 짝수의 합 n번 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-the-sum-of-even-numbers-n-times/description
 * 2. 풀이핵심
 *  - n번 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int num = a;num <= b;num++) {
                if (num % 2 != 0) continue;
                sum += num;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }
}