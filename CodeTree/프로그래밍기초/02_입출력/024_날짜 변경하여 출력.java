import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 날짜 변경하여 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-date-with-different-format/description
 * 2. 풀이핵심
 *  - StringTokenizer 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        String y = st.nextToken();
        String m = st.nextToken();
        String d = st.nextToken();
        System.out.println(m + "-" + d + "-" + y);
    }
}