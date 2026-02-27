class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {  // Overloading
        return a * b * c;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b) {  // Overriding
        System.out.println("Overridden method");
        return a * b;
    }
}

class DifferenceDemo {
    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();

        System.out.println(obj.multiply(2, 3));
        System.out.println(obj.multiply(2, 3, 4));
    }
}