import org.junit.jupiter.api.*;

public class BigClassTestStefan {

    @BeforeAll
    static void setup(){
        System.out.println("Starting testsuite - (Before All)");
    }

    @BeforeEach
    void setupEach(TestInfo testInfo){
        System.out.println("Test starts - " + testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Closin testsuite - (After All)");
    }

    @AfterEach
    void tearDownEach(TestInfo testInfo){
        System.out.println("Test closes - " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Kolla om setters funkar.")

    void checkSetFunction() {
        BigClass testObject = new BigClass(10);
        int expected = 10;      // Test code
        testObject.setNumber(-10);  //CUT
        int actual = testObject.getNumber();
        Assertions.assertEquals(expected, actual); // Assertions
    }

    @Test
    @DisplayName("Kolla även om getters funkar.")
    void checkGetFunction() {
        BigClass testObject = new BigClass("Stefan");
        String expected = "Stefan";
        String actual = testObject.getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkSumOfNumbers(int expected, int number) {
        BigClass testObject = new BigClass(10);
        int expected = 10 + number;
        int actual = testObject.addNumbers(expected);
    }

    @Test
    @DisplayName("Kolla toUpperCase-metoden.")

    void showUpperString(String text, String input) {

    }
}
