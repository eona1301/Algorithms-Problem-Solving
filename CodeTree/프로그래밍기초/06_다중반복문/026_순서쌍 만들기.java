import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 순서쌍 만들기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/making-order-pair/description
 * 2. 풀이핵심
 *  - 일반적인 순서로 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = N;n > 0;n--) {
            for (int m = N;m > 0;m--)
                sb.append("(").append(n).append(",").append(m).append(") ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}