public class PolynomialTerm extends LinearTerm{
    private int term;
    private int power;
    
    // contructor class
    public PolynomialTerm(int val, int power){
        super(val);
        setPower(power);
        setTerm(val);
    }

    // setter for term
    public void setTerm(int term){
        this.term = term;
    }

    // getter for term
    public int getTerm(){
        return term;
    }

    // setter for power
    public void setPower(int power){
        this.power = power;
    }

    // getter for power
    public int getPower(){
        return power;
    }


    // calcualtes the polynomial term with the expression value given
    public double evaluate(double val){
        double x, y;
        x = getTerm();
        y = getPower();

        double ans = x * Math.pow(val, y);
        return ans;
    }

    public ITerm derivative(){
        int term = getTerm();
        int power = getPower();
        int val = term * power;
        PolynomialTerm poly = new PolynomialTerm(val, power - 1);
        
        return poly;
    }

    public String toString(){
        if (getTerm() < 0){
        return "- " + getTerm()*-1 + "x^" + getPower() + " ";
        }
        else if (getTerm() > 0){
            return "+ " + getTerm() + "x^" + getPower() + " ";
        }
        return "";
    }
}
