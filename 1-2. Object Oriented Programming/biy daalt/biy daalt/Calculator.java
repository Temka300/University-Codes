class Calculator {
    private int num1;
    private int num2;
    private MathOperations mathOperations;

    public Calculator() {
        mathOperations = new MathOperations();
    }

    public void organize(MathOperations mathOperations, int num1, int num2) {
        this.mathOperations = mathOperations;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addAndPrint() {
        int result = mathOperations.addition(num1, num2);
        System.out.println("Addition Result: " + result);
    }

    public void multiplyAndPrint() {
        int result = mathOperations.multiplication(num1, num2);
        System.out.println("Multiplication Result: " + result);
    }

    public void subtractAndPrint() {
        int result = mathOperations.subtraction(num1, num2);
        System.out.println("Subtraction Result: " + result);
    }

    public void divideAndPrint() {
        try {
            int result = mathOperations.division(num1, num2);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}