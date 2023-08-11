public class BasicComplexCalculator implements ComplexCalculator {
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws ArithmeticException {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль.");
        }
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}
