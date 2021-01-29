import java.util.Random;
import java.util.Scanner;

public class MyClass {

    public boolean generateTrue() {
        return true;

    }

    public boolean generateFalse() {
        return false;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int negative(int value) {
        return -(value);
    }

    public int inc(int value) {
        int incValue = value;
        for(int i = 1; i < 300; i++) {
            incValue = incValue + value;
            System.out.println(incValue);
        }
        return incValue;
    }

    public int generateRandom(int value) {
        Random r = new Random();
        int generate = r.nextInt(value);
        int generateValue = generate;
        for (int i = 1; i < 100; i++) {
            generate = generateValue+generate;
            System.out.println(generateValue);
        }
        return generateValue;
    }

    public void inc() {

    }
}

