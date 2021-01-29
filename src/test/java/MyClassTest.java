import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class MyClassTest {

    @BeforeAll
    static void init() {
        System.out.println("Starting testsuite for MyClass.");
    }

    @BeforeEach
    static void init() {

    }



    @Test
    void testGenerateTrue(TestInfo testInfo) {
        System.out.println("Started test: " + testInfo.getDisplayName());
        MyClass testObject = new MyClass();     // Test Code
        boolean actual = testObject.generateTrue(); // CUT
        Assertions.assertTrue(actual);              // Assertions
        System.out.println("Test " + testInfo.getDisplayName() + " concluded.");
    }

    @ParameterizedTest
    @DisplayName("Tests method negative().")
    @CsvSource({
            "-5, 5",
            "-10, 10",
            "-20, 20",
            "-100, 100",
            "-1000, 1000",
    })
    void testNegative(int expected, int input) {
        MyClass testObject = new MyClass();     // Test Code
        int actual = testObject.negative(input);    // CUT
        Assertions.assertEquals(expected, actual);  // Assertions
    }


    @Test
    void testGenerateFalse() {
        MyClass testObject = new MyClass();     // Test Code
        boolean actual = testObject.generateFalse(); // CUT
        Assertions.assertFalse(actual);              // Assertions
    }

    @Test
    void testAdd() {
        MyClass testObject = new MyClass();     // Test Code
        int input1 = 5;
        int input2 = 7;
        int expected = 12;
        int actual = testObject.add(input1,input2); // CUT
        Assertions.assertEquals(expected, actual);              // Assertions
    }

    @Test
    void inc() {

    }


}
