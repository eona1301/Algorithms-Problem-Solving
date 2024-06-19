import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 역순으로 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-string-in-reverse/description
 * 2. 풀이핵심
 *  - 문자열 리스트 관리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 4;
    public static String[] ARR = new String[N];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int n = N - 1;n >= 0;n--)
            ARR[n] = br.readLine();

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            sb.append(ARR[n]).append("\n");
        System.out.println(sb.toString());
    }
}