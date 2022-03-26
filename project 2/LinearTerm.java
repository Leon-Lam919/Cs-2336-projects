public class LinearTerm extends ConstantTerm{
    private int x;

    // construtor method
    public LinearTerm(int term){
    }

    public double getX(double x){return x;}

    public void setX(int X){this.x = X;}

    // method that takes in the int and returns the int with "x" afterwards
    // TODO: needs to be called from ITerm and not from here when called, dont know how to solve yet
    public String linearTerm(int x){
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
        // TODO derive the linear term to a constant
        // TODO: return a value of ITerm type
        return null;
    }

    // can eval with values from main
    // TODO; needs to work with ITerm
    public double evaluate(double expression) {

        double value = getX(x);

        double ans = expression * value;

        return ans;
        
    }
}