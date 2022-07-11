public class Main {
    public static void main(String[] args) {
        System.out.println("Before method call");
        doSomething();
        System.out.println("After method call");




        double result = calculateInterest(100d, 0.05d, 10);
        System.out.println(result); // 50.0

    }

    private static void doSomething() {
        System.out.println("Inside Method");
        System.out.println("Still inside");
    }

    private static double calculateInterest(double amt, double rate, int years) {
        double interest = amt * rate * years;
        return interest;
    }
}