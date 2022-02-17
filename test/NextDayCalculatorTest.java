import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String Expected = "2/1/2018";
        String result = NextDayCalculator.testDay(day, month, year);
        assertEquals(result, Expected);
    }

    @Test
    void testDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String Expected = "1/2/2018";
        String result = NextDayCalculator.testDay(day, month, year);
        assertEquals(result, Expected);
    }

    @Test
    void testDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String Expected = "1/5/2018";
        String result = NextDayCalculator.testDay(day, month, year);
        assertEquals(result, Expected);
    }

    @Test
    void testDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String Expected = "1/3/2018";
        String result = NextDayCalculator.testDay(day, month, year);
        assertEquals(result, Expected);
    }

    @Test
    void testDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String Expected = "1/3/2020";
        String result = NextDayCalculator.testDay(day, month, year);
        assertEquals(result, Expected);
    }
    @Test
    void testDay5() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String Expected = "1/1/2019";
        String result = NextDayCalculator.testDay(day, month, year);
        assertEquals(result, Expected);
    }
}