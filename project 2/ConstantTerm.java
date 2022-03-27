public class ConstantTerm implements ITerm{
    private double x;
    // can create a var of ITerm

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
        ConstantTerm c = new ConstantTerm(getX());
        return c;
    }

    
    public double evaluate(double expression) {
        return getX();
    }

    
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        ConstantTerm d = new ConstantTerm(5.0);

        d.derivative();
    }
}