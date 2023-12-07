import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 합과 평균
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-and-avg/description
 * 2. 풀이핵심
 *  - StringTokenizer와 연산
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = a + b;
        double avg = sum / 2.0;
        System.out.printf("%d %.1f", sum, avg);
    }
}