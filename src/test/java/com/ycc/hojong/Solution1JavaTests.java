package com.ycc.hojong;

import com.ycc.beomseok.Solution1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution1JavaTests {
    private Solution1 solution1;

    @BeforeEach
    public void prepareTest() {
        solution1 = new Solution1();
    }

    @Test
    public void given_케이스1_then_성공() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "TestValue";
        String expectedResultValue = "";

        //WHEN - 실제 로직 수행
        String actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_케이스2_then_실패() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "TestValue";
        String expectedResultValue = ";";

        //WHEN - 실제 로직 수행
        String actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertNotEquals(expectedResultValue, actualResultValue);
    }
}