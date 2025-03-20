package gcu.wa.calculator;

public class Number {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add() {
        return this.firstNumber + this.secondNumber;
    }

    public int subtract() {
        return this.firstNumber - this.secondNumber;
    }

    public int multiply() {
        return this.firstNumber * this.secondNumber;
    }

    public double divide() {
        return this.firstNumber / this.secondNumber;
    }
}
