package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'all sqrs of number suitable in range, both on limits', 100, 9801, 90",
            "sqrs of number not in the range, 145, 168, 0",
            "'sqrs of number in range, no on limits', 200, 300, 3",
            "'sqrs of number in range, first on limit', 169, 624, 12",
            "'sqrs of number in range, last on limit', 168, 625, 13"})

// 1 - dates from lessen; 2 - nothing in range; 3 -  all suitable; 4 -

    void shouldCountSqrtInRanges (String testName, long range1, long range2, long expected){

        SQRService service = new SQRService();

        long actual = service.countSqrtInRange(range1, range2);

        assertEquals(expected, actual);
    }

}