public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public double sum(int arg0, int arg1) {
        double x = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return x;
        //считаем через target
    }

    @Override
    public double mult(int arg0, int arg1) {
        double x = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return x;
    }

    @Override
    public double pow(int arg0, int arg1) {
        double x = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.POW)
                .result();
        return x;
    }
}
