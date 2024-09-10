class BiyDaalt21 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        MathOperations mathOperations = new MathOperations();

        calculator.organize(mathOperations, 10, 5);
        calculator.addAndPrint();
        calculator.multiplyAndPrint();
        
        System.out.println(" ");

        calculator.setNumbers(20, 8);
        calculator.subtractAndPrint();
        calculator.divideAndPrint();
    }
}