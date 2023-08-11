public class LoggingComplexCalculator implements ComplexCalculator {
    private ComplexCalculator delegate;

    public LoggingComplexCalculator(ComplexCalculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        SimpleLogger.info("Сложение " + num1 + " и " + num2);
        return delegate.add(num1, num2);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        SimpleLogger.info("Умножение " + num1 + " и " + num2);
        return delegate.multiply(num1, num2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        SimpleLogger.info("Деление " + num1 + " и " + num2);
        return delegate.divide(num1, num2);
    }
}
