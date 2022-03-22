public class LinearTerm implements ITerm{
   
    // construtor method
    public LinearTerm(){}

    public LinearTerm(int x){}

    // method that takes in the int and returns the int with "x" afterwards
    // TODO: needs to be called from ITerm and not from here when called, dont know how to solve yet
    public String linearTerm(int x){
       String xVal = "x";

       return x + xVal;
   }

    @Override
    public ITerm derivative() {
        // TODO derive the linear term to a constant
        // TODO: return a value of ITerm type
        return null;
    }

    @Override
    public double evaluate(double expression) {
        // TODO: evaluate the number with the value given
        return 0;
    }
}