package thuchanhrefactoringdoitenbienvatachhang;

public class CalculatorTest {
    public static void main(String[] args) {
        int firstOperand = 12;
        int secondOperand = 8;

        //cộng
        char operator = Calculator.ADDITION;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("12 + 8 = " + result);

        //trừ
        operator = Calculator.SUBTRACTION;
        result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("12 - 8 = " + result);

        //nhân
        operator = Calculator.MULTIPLICATION;
        result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("12 * 8 = " + result);

        //chia
        operator = Calculator.DIVISION;
        result = Calculator.calculate(firstOperand, secondOperand, operator);
        System.out.println("12 / 8 = " + result);

        // kiem tr chia 0
        try {
            Calculator.calculate(12, 0, Calculator.DIVISION);
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
