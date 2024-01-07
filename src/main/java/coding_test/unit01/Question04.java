package coding_test.unit01;

import java.util.ArrayList;
import java.util.Scanner;

public class Question04 {
    /**
     * [문제 4] 단어 뒤집기
     * 예시 입력, 출력은 Test 코드를 참고한다.

     * 설명
     * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

     * 입력
     * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
     * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

     * 출력
     * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
     */

    //reverse() 메소드를 활용한 문자 뒤집기
    public ArrayList<String> solution1(int num, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str){
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    //알고리즘으로 문자 뒤집기
    public ArrayList<String> solution2(int num, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str){
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;

            while (lt<rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        Question04 question04 = new Question04();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] str = new String[num];

        for (int i = 0; i < num; i++){
            str[i] = sc.next();
        }
        for (String x: question04.solution1(num, str)){
            System.out.println(x);
        }
        for (String x: question04.solution2(num, str)){
            System.out.println(x);
        }
    }
}
