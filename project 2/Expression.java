public class Expression{
    
    //constructor method 
    public Expression(){}

    public ITerm derivative(){
        return null;
    }

    // getter taht returns a new expression object containing the derivate of each term of the original obj
    public Expression getDerivative(){
        // created instance of expression and returns expression
        Expression E = new Expression();
        return E;
    }

    // TODO: get the evaluation of the expression that is sent in
    // gets eval
    public double evaluate(double expression){
        // returns double
        return 0.0;

    }

    public String toString(){
        // TODO: returns the input to string type
        return null;
    }

    public void add(ITerm x){

        // needs to add to linked list
        
    }

    // TODO: create a linked list of ITerms



    // when trying to call the add method in LL, does not work, looking for fix
    // need to create LL constructor method

}
