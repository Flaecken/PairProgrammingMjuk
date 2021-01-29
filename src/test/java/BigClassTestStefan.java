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
    @DisplayName("Kolla om setters/getters funkar.")

    int showMyNumber(int expected, int input) {
        BigClass testObject = new BigClass();
        testObject.setNumber(10);

    }
}
