import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 입력받아 계산 3
 *  - 링크 : https://www.codetree.ai/missions/4/problems/input-calculate-3/description
 *  2. 풀이핵심
 *  - 입력 및 연산
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a * b);
    }
}