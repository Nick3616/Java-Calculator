public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new LoggingComplexCalculator(new BasicComplexCalculator());
        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(3, 4);

        System.out.println("Результат сложения: " + calculator.add(num1, num2));
        System.out.println("Результат умножения: " + calculator.multiply(num1, num2));
        System.out.println("Результат деления: " + calculator.divide(num1, num2));
    }
}
