package coding_test.unit01;

import java.util.Scanner;

public class Question02 {

    /**
     * [문제 2] 문장 속 단어
     * 예시 입력, 출력은 Test 코드를 참고한다.

     * 설명
     * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

     * 입력
     * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
     * 문자열은 영어 알파벳으로만 구성되어 있습니다.

     * 출력
     * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
     */
     public String solution(String str){
            StringBuilder answer = new StringBuilder();
            for (char c : str.toCharArray()){
                if (Character.isLowerCase(c)){
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
            return answer.toString();
        }

        public static void main(String[] args){
            Question02 question02 = new Question02();
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.print(question02.solution(str));
        }
}
