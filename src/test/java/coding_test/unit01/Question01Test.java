package coding_test.unit01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question01Test {

    @Test
    public void testSolution() {
        // 테스트 입력값
        String str = "Computercooler";
        char c = 'c';

        // 예상값
        int expected = 2;

        // 테스트 메소드
        Question01 q1 = new Question01();
        int result = q1.solution(str, c);

        // 예상값과 실제 결과값 비교
        assertEquals(expected, result);
    }
}
