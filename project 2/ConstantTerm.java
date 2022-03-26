public class ConstantTerm implements ITerm{

    private double x;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    public ConstantTerm(double x){
        setX(x);
    }


    public ITerm derivative() {
        // creating a new instance of a class that inherits Constant that implements ITerm, becomes a 
        // return type of ITerm
        PolynomialTerm poly = new PolynomialTerm(1, 1);
        return poly;
    }

    
    public double evaluate(double expression) {
        return getX();
    }

    
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}