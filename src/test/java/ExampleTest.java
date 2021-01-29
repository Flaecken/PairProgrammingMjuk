import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

public class ExampleTest {

    @BeforeAll
    static void setup() {
        System.out.println("Starting test - (Before all)");
    }

    @BeforeEach
    void setupEach(TestInfo testInfo) {
        System.out.println("Starting test - " + testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Closing test - (After all)");
    }

    @AfterEach
    void tearDownEach(TestInfo testinfo) {
        System.out.println("Closing test - " + testinfo.getDisplayName());
    }

    @Test
    void testStringLength() {
        String stringExample = "Jolin";      // Test Code
        int expected = 5;                   //Test Code
        int actual = stringExample.length();    // Code Under Test (CUT)
        Assertions.assertEquals(expected, actual);  //Assertions

    }

    @Test
    void testMax() {
        int high = 15;
        int low = 5;
        int expected = 15;
        int actual = 15;
        Math.max(expected, actual);

    }

    @Test
    void testContains() {
        String testString = "abcdefg";
        boolean actual = testString.contains("g");
        Assertions.assertTrue(actual);

    }

    @Test
    void testIfEmpty() {
        String testTrue = "";
        String testFalse = "hej";
        boolean actual = testTrue.isEmpty();
        Assertions.assertTrue(actual);
        actual = testFalse.isEmpty();
        Assertions.assertFalse(actual);
    }


    @ParameterizedTest
    @CsvSource({
            "-5, 5",
            "-10, 10",
            "-20, 20",
            "-100, 100",
            "-1000, 1000",
    })

    @Test
    void TestCorrectSum() {
        boolean actual = 
    }


    void negative_test1(int expected, int input) {


    }

    @ParameterizedTest
    @DisplayName("Test string.length with different parameters.")
    @ValueSource(strings = {"a", "ab", "abcd", "abcdefg", "hijklmnopq"})  // Test Code
    void testIfNotZero(String input) {
        int actual = input.length();    // CUT
        Assertions.assertTrue(actual > 0);  // Assertions

    }


    @ParameterizedTest
    @DisplayName("Test string.toUpperCase() with multiple parameters")
    @CsvSource({
            "ALL, all",
            "HAIL, hail",
            "THE, the",
            "UPPER, upper",
            "CASE, case",
    })

    void testToUpperCase(String expected, String input) {
        String actual = input.toUpperCase();
        Assertions.assertEquals(expected, actual);
    }

    @RepeatedTest(10)
    @DisplayName("Test exec response times.")
    void repeatedTest() {
        MyClass testObject = new MyClass();
        Assertions.assertTimeout(Duration.ofMillis(100), () -> testObject.inc();
    }







}
