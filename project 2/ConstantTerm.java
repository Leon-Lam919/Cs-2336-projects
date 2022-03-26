public class ConstantTerm implements ITerm{

    public ConstantTerm(){}


    public ITerm derivative() {
        // creating a new instance of a class that inherits Constant that implements ITerm, becomes a 
        // return type of ITerm
        PolynomialTerm poly = new PolynomialTerm(1, 1);
        return poly;
    }

    
    public double evaluate(double expression) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}