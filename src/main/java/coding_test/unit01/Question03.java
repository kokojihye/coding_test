package coding_test.unit01;

import java.util.Scanner;

public class Question03 {
    /**
     * [문제 3] 문장 속 단어
     * 예시 입력, 출력은 Test 코드를 참고한다.

     * 설명
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     * 문장속의 각 단어는 공백으로 구분됩니다.

     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

     * 출력
     * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
     * 단어를 답으로 합니다.
     */
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE; //최소값으로 초기화
        String[] s = str.split(" "); //띄어쓰기를 기준으로 단어를 나눔

        for (String x : s){
            int length = x.length();
            if (length > max){
                max = length;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Question03 question03 = new Question03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(question03.solution(str));
    }
}
