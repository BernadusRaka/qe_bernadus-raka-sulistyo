package Model;

public class Calc implements Calculation{
    private double result;

    public Calc(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public double getAdd() {
        return Math.addExact(3,4);
    }

    @Override
    public double getSubs() {
        return Math.subtractExact(15,4);
    }

    @Override
    public double getMulti() {
        return Math.multiplyExact(10,10);
    }

    @Override
    public double getDiv() {
        return Math.floorDiv(12,3);
    }
}
