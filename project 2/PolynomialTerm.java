public class PolynomialTerm extends LinearTerm{
    private double term;
    private int power;
    
    // contructor class
    public PolynomialTerm(){}

    // setter for term
    public void setTerm(double term){
        this.term = term;
    }

    // getter for term
    public double getTerm(double term){
        return term;
    }

    // setter for power
    public void setPower(int power){
        this.power = power;
    }

    // getter for power
    public int getPower(int power){
        return power;
    }
    
    public String PolyTerm(int term, int power){
        
        
        if (term < 0){
            return "- " + term*-1 + "^" + power;
        }
        else{
            return term + "^" + power;
        }
    }
}
