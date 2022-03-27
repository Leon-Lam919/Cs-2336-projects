public class ConstantTerm implements ITerm{
    private double x;
    // can create a var of ITerm
    ITerm c;

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
        double num = getX();
        if (num < 0){
            // return with -
        }
        else if (num > 0){
            // return with +
        }
               
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