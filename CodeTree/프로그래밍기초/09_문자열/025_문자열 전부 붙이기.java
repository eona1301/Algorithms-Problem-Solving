import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 전부 붙이기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/paste-all-string/description
 * 2. 풀이핵심
 *  - 문자열 concat
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) sb.append(br.readLine());
        System.out.println(sb.toString());
    }
}