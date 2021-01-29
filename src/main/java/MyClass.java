import java.util.Random;

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

    public void printExample() {
            String name = "Stefan";
            System.out.print(name.toUpperCase());
    }

    public int generateRandom(int value) {
        Random r = new Random();
        int generate = r.nextInt(value);
        int generateValue = generate;
        for(int i = 1; i<500; i++) {
            generate = generateValue+generate;
            System.out.println(generateValue);
        }
        return generateValue;
    }

    public int inc(int value) {
        int incValue = value;
        for(int i = 1; i<10000; i++) {
            incValue = incValue+value;
            System.out.println(incValue);
        }
        return incValue;
    }
}
