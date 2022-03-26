public class PolynomialTerm extends LinearTerm{
    private double term;
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
    public double getTerm(){
        return term;
    }

    // setter for power
    public void setPower(int power){
        this.power = power;
    }

    // getter for power
    public double getPower(){
        return power;
    }

    // returns the polynomail in the correct form
    public String PolyTerm(int term, int power){
        setTerm(term);
        setPower(power);
        
        if (term < 0){
            return "- " + term*-1 + "^" + power;
        }
        else{
            return term + "^" + power;
        }
    }

    // calcualtes the polynomial term with the expression value given
    public double evaluate(double val){
        double x, y;
        x = getTerm();
        y = getPower();

        double ans = x * Math.pow(val, y);
        return ans;
    }
}
