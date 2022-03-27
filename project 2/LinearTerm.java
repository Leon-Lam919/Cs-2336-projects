public class LinearTerm extends ConstantTerm{
    private double x;

    // construtor method
    public LinearTerm(double term){
        super(term);
        setX(term);
    }

    public double getX(double x){return x;}

    public void setX(double x){this.x = x;}

    // method that takes in the int and returns the int with "x" afterwards
    // TODO: needs to be called from ITerm and not from here when called, dont know how to solve yet
    public String linearTerm(double x){
       String xVal = "x";
        setX(x);

       if (x < 0){
           return "- " + -1*x + xVal;
       }
       else{
           return x + xVal;
       }
   }


    public ITerm derivative() {
        LinearTerm lin = new LinearTerm(getX());
        return lin;
    }

    // can eval with values from main
    // TODO; needs to work with ITerm
    public double evaluate(double expression) {

        double value = getX(x);

        double ans = expression * value;

        return ans;
        
    }
}